package com.example.ToDoList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/v1")
public class Controller {
    @Autowired
    public Service service;

    @GetMapping("/getAll")
    public List<Model> getAll() {
        return service.findAll();
    }

    @PostMapping("/tasks")

    public Model save(
            @RequestBody Model model)
    {
        return service.save(model);
    }



    @PutMapping("/task/{id}")

    public Model
    update(@RequestBody Model model,
                     @PathVariable("id") int id)
    {
        return service.update(
                model, id);
    }


    @DeleteMapping("/task/{id}")

    public String delete(@PathVariable("id")
                                       int id)
    {
        service.delete(
                id);
        return "Deleted Successfully";
    }
}
