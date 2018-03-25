package com.khania.khania_1202154350_modul5;

/**
 * Created by ASUS on 3/25/2018.
 */

public class TodoModel {
    String nameTodo, description, priority;

    //method setter getter

    public String getNameTodo() {
        return nameTodo;
    }

    public void setNameTodo(String name) {
        this.nameTodo = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public TodoModel(String nameTodo, String description, String priority) {
        this.nameTodo = nameTodo;
        this.description = description;
        this.priority = priority;
    }
}
