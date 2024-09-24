package com.todotask.todotask.repository;

import com.todotask.todotask.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITodoRepository extends JpaRepository<Todo, Long> {

}
