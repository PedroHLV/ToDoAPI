package com.todotask.todotask.service;

import com.todotask.todotask.entity.Todo;
import com.todotask.todotask.repository.ITodoRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    private ITodoRepository todoRepository;

    public TodoService(ITodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> createTodoList(Todo todo) {
        todoRepository.save(todo);
        return listCreatedList();
    }

    public List<Todo> listCreatedList() {
        Sort sort = Sort.by("prioridade").descending().and(Sort.by("nome").ascending());
        return todoRepository.findAll(sort);
    }

    public List<Todo> updateTodoList(Todo todo) {
        todoRepository.save(todo);
        return listCreatedList();
    }

    public List<Todo> deleteTodoList(Long id) {
        todoRepository.deleteById(id);
        return listCreatedList();
    }
}
