package com.example.ToDoList;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Objects;

@org.springframework.stereotype.Service
public class Service_Impl implements  Service {
    @Autowired
    public Repository repository;


    @Override
    public List<Model> findAll() {
      return  (List<Model>) repository.findAll();

    }
        public Model save(Model model)
        {
            return repository.save(model);
        }


        public Model update(Model model,
                int id)
        {

            Model model1
                    = repository.findById(id)
                    .get();

            if (Objects.nonNull(model.getName())
                    && !"".equalsIgnoreCase(
                    model.getName())) {
                model1.setName(
                        model.getName());
            }

            if (Objects.nonNull(
                    model.getTasks())
                    && !"".equalsIgnoreCase(
                    model.getTasks())) {
                model1.setTasks(
                        model.getName());
            }


            return repository.save(model1);
        }


        public void delete(int id)
        {
            repository.deleteById(id);
        }
    }


