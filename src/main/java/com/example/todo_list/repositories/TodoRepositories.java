package com.example.todo_list.repositories;

import com.example.todo_list.models.TodoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class TodoRepositories extends JpaRepository<TodoModel, Long> {
}
