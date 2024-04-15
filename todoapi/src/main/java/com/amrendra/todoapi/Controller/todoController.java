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

    @DeleteMapping("/{id}")
    public Todo deleteTask(@PathVariable int id, @RequestBody Todo todo){
        todoRepo.deleteById(id);
        return todo;
    }
    @PutMapping("/{id}")
    public String UpdateTask(@PathVariable int id, @RequestBody Todo todo){
       Todo taskId=todoRepo.findById(id).orElseThrow();
       taskId.setId(todo.getId());
       taskId.setTask(todo.getTask());
        return "Task updated";
    }

}