package com.example.todo_list.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Id {

    private Long id;

    public Long getId (){
        return id;
    }
}
