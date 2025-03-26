package com.example.todo_list.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Todo")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TodoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String description;
    private String title;
    private String prioritie;
    private Boolean active;

}
