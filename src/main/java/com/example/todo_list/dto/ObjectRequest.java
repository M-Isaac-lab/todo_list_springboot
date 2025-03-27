package com.example.todo_list.dto;

import com.example.todo_list.Dataenum.DataEnum;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor

public class ObjectRequest {
    //private Long id;
    private Boolean active;
    private String description;
    private DataEnum prioritie;
    private String title;



    //public Long getId() {
    //    return id;
    //}

    public Boolean getActive(){
        return active;
    }

    public String getDescription(){
        return description;
    }

    public DataEnum getPrioritie() {
        return prioritie;
    }

    public String getTitle() {
        return title;
    }
}
