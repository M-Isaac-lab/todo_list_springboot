package com.example.todo_list.dto;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor

public class ObjectRequest_Update {

    private Long id;
    private Boolean active;
    private String description;
    private String prioritie;
    private String title;

    public Long getId() {
        return id;
    }

    public Boolean getActive(){
        return active;
    }

    public String getDescription(){
        return description;
    }

    public String getPrioritie() {
        return prioritie;
    }

    public String getTitle() {
        return title;
    }
}
