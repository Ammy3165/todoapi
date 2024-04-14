package com.amrendra.todoapi.Controller;

import com.amrendra.todoapi.Repository.todoRepository;

import com.amrendra.todoapi.Todo.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/app")
public class todoController {
    @Autowired
    private todoRepository todoRepo;

    @PostMapping("/task")
    public String addTask(@RequestBody Todo todo) {
       todoRepo.save(todo);
        return "Task added successfully";
    }

    @GetMapping("/task")
    public List<Todo>  getTask() {
     List<Todo> todoList= todoRepo.findAll();
        return todoList;
    }

}