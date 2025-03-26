package com.example.todo_list.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController  // Permet à Spring de gérer ce contrôleur
public class TodoController {

    @GetMapping("/hello")  // Route accessible via http://localhost:8080/hello
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }
}
