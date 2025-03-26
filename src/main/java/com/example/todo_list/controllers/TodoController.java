package com.example.todo_list.controllers;
import com.example.todo_list.dto.ObjectRequest;
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
    public ResponseEntity<?> hello() {
        return ResponseEntity.of(
                Optional.ofNullable(todoService.getAllTodoModel())
        );
    }

    @PostMapping("/object")
    public ResponseEntity<?> getobject(@RequestBody ObjectRequest obj){
        return ResponseEntity.of(
Optional.ofNullable(todoService.getTodo(obj.getObj()))
                );
    }

}
