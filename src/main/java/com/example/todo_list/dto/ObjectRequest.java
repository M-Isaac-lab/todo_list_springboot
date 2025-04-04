package com.example.todo_list.dto;

import com.example.todo_list.Dataenum.DataEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
public class ObjectRequest {
    //private Long id;
    private Boolean active;
    private String description;
    private DataEnum prioritie;
    private String title;


    //public Long getId() {
    //    return id;
    //}

}
