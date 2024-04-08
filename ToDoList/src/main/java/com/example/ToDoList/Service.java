package com.example.ToDoList;

import java.util.List;

public interface Service  {
    public List<Model> findAll();
    Model save(Model model);

    Model update(Model model,int id);


    void delete(int id);
}
