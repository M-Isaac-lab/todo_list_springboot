package com.example.todo_list.repositories;

import com.example.todo_list.models.TodoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepositories extends JpaRepository<TodoModel, Long> {

    TodoModel findByDescription(String description);
    List<TodoModel> findAllByDescription(String description);
}
