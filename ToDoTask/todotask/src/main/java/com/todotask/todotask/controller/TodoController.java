package com.todotask.todotask.controller;

import com.todotask.todotask.entity.Todo;
import com.todotask.todotask.service.TodoService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {
    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping("/createToDo")
    List<Todo> create(@RequestBody @Valid Todo todo) {
        return todoService.createTodoList(todo);
    }

    @GetMapping("/listToDo")
    List<Todo> list(Todo todo) {
        return todoService.listCreatedList();
    }

    @PutMapping("/updateToDo")
    List<Todo> update(@RequestBody @Valid Todo todo) {
        return todoService.updateTodoList(todo);
    }

    @DeleteMapping("/deleteTodo/{id}")
    List<Todo> delete(@PathVariable("id") @Valid Long id) {
        return todoService.deleteTodoList(id);
    }
}
