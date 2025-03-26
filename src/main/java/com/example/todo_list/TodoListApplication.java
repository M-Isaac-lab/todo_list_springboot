package com.example.todo_list;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
public class TodoListApplication {

    public static void main(String[] args) {

        SpringApplication.run(TodoListApplication.class, args);
    }

}
