package com.example.todo_list.dto;


import com.example.todo_list.Dataenum.DataEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class ObjectRequest_Update {

    private Long id;
    private Boolean active;
    private String description;
    private DataEnum prioritie;
    private String title;


}
