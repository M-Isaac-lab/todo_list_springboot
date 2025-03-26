package com.example.todo_list.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Todo")
public class TodoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String description;
    private String title;
    private String prioritie;
    private Boolean active;

    public TodoModel(){}

    public TodoModel(String description, String title, String prioritie, Boolean active){
        this.description = description;
        this.title = title;
        this.prioritie = prioritie;
        this.active = active;
    }

    public Long getId() {
        return id;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getPrioritie(){
        return prioritie;
    }

    public void setPrioritie(String prioritie){
        this.prioritie = prioritie;
    }

    public Boolean getActive (){
        return active;
    }

    public void setActive(Boolean active){
        this.active = active;
    }


}
