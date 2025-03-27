package com.example.todo_list.controllers;
import com.example.todo_list.dto.Id;
import com.example.todo_list.dto.ObjectRequest;
import com.example.todo_list.dto.ObjectRequest_Update;
import com.example.todo_list.services.TodoService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("todo")
@AllArgsConstructor
public class TodoController {

    private final TodoService todoService;

    @GetMapping("/all")  // Route accessible via http://localhost:8080/hello
    public ResponseEntity<?> GetAllTodoModel() {
        return ResponseEntity.of(
                Optional.ofNullable(todoService.getAllTodoModel())
        );
    }

    @GetMapping("{id}")
    public ResponseEntity<?> GetTodo(@PathVariable Long id){
        return ResponseEntity.of(
                Optional.ofNullable(
                        todoService.getTodo(id)
                )
        );
    }

    @PostMapping("/create")
    public ResponseEntity<?> CreateTodo(@RequestBody ObjectRequest obj){
        return ResponseEntity.of(
Optional.ofNullable(
        todoService.createTodo(obj)
)
                );
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> UpdateTodo(@PathVariable Long id, @RequestBody ObjectRequest_Update update){
        return ResponseEntity.of(
                Optional.ofNullable(
                  todoService.updateTodo(id, update)
                )
        );
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> DeleteTodo(@PathVariable Long id, @RequestBody Id identif){
           todoService.deleteTodo(id, identif);
        return ResponseEntity.ok("Todo deleted successfully");

    }

}
