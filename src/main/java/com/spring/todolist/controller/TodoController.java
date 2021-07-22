package com.spring.todolist.controller;

import com.spring.todolist.model.TodoItem;
import com.spring.todolist.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@RestController //@RestController make this class as Rest Endpoint
@RequestMapping(value = "/todo") //To access this class, by /todo
public class TodoController {

    @Autowired //Automatically initialize TodoRepository here
    private TodoRepository todoRepository;

    @GetMapping
    public List<TodoItem> getAllItem() { //http:localhost:8080/todo will return all the items
        return todoRepository.findAll();
    }

    @PostMapping
    public TodoItem addItem(@Valid @NotNull @RequestBody TodoItem todoItem) {
        return todoRepository.save(todoItem);
    }

    @PutMapping
    public TodoItem updateItem(@Valid @NotNull @RequestBody TodoItem todoItem) {
        return todoRepository.save(todoItem); //Here we are also using the "save()", but to update the values, in the request we are going to send the id as well.
    }

    @DeleteMapping(value = "/{id}")
    public void deleteItem(@PathVariable Long id) {
        todoRepository.deleteById(id);
    }

}
