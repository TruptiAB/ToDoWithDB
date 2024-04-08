package com.example.ToDoList;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="todolist")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Model {
  @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(name = "name", nullable = false)
    String name;
    @Column(name = "tasks", nullable = false)
    String tasks;

//    public Model(String name, String tasks){
//
//        this.name=name;
//        this.tasks=tasks;
//    }
//
//    public String getTasks() {
//        return tasks;
//    }
//
//    public void setTasks(String tasks) {
//        this.tasks = tasks;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//

}


