package com.example.todo_list.services;

import com.example.todo_list.models.TodoModel;
import com.example.todo_list.repositories.TodoRepositories;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class TodoService {


    private final TodoRepositories todoRepositories;

    public List<TodoModel> getAllTodoModel(){

        return  todoRepositories.findAll();
    }

    public TodoModel getTodo(String description) {
        return todoRepositories.findByDescription(description);
    }



}
