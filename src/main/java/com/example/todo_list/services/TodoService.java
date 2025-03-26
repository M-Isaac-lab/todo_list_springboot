package com.example.todo_list.services;

import com.example.todo_list.dto.Id;
import com.example.todo_list.dto.ObjectRequest;
import com.example.todo_list.dto.ObjectRequest_Update;
import com.example.todo_list.models.TodoModel;
import com.example.todo_list.repositories.TodoRepositories;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.rmi.UnexpectedException;
import java.util.List;
import java.util.Optional;


@Service
@AllArgsConstructor
public class TodoService {


    private final TodoRepositories todoRepositories;

    public List<TodoModel> getAllTodoModel(){
        return  todoRepositories.findAll();
    }

    public TodoModel createTodo (ObjectRequest description) {
        //return todoRepositories.findByDescription(description);
        TodoModel todo = new TodoModel();
        todo.setActive(description.getActive());
        todo.setDescription(description.getDescription());
        todo.setPrioritie(description.getPrioritie());
        todo.setTitle(description.getTitle());
        return todoRepositories.save(todo);

    }

    public TodoModel updateTodo(Long id, ObjectRequest_Update update){
        Optional<TodoModel> optionalTodoModel = todoRepositories.findById(id);
        if (optionalTodoModel.isPresent()) {
            TodoModel existingTodo = optionalTodoModel.get();

            // Mise à jour des champs
            existingTodo.setTitle(update.getTitle());
            existingTodo.setDescription(update.getDescription());
            existingTodo.setActive(update.getActive());
            existingTodo.setPrioritie(update.getPrioritie());

            // Sauvegarde et retour de l'objet mis à jour
            return todoRepositories.save(existingTodo);
        } else {
            throw new RuntimeException("Todo not found with id: " + id);
        }
    }

    public void deleteTodo(Long ident, Id id) {
        Optional<TodoModel> optionalTodoModel = todoRepositories.findById(ident);

        if (optionalTodoModel.isEmpty()) {
            throw new RuntimeException("Todo not found with id: " + ident);
        }

        TodoModel existingTodo = optionalTodoModel.get();

        // Vérification de l'autorisation
        if (!existingTodo.getId().equals(id.getId())) {
            throw new RuntimeException("You don't have the authorization");
        }

        // Suppression de l'élément
        todoRepositories.deleteById(ident);

    }



    public TodoModel getTodo(Long id) {
        Optional<TodoModel> optionalTodoModel = todoRepositories.findById(id);
        if(optionalTodoModel.isPresent()){
            TodoModel existingTodo = optionalTodoModel.get();
            return existingTodo;
        } else {
            throw new RuntimeException("Todo Not Existe");
        }

    }
}
