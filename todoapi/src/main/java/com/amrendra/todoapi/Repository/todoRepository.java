package com.amrendra.todoapi.Repository;

import com.amrendra.todoapi.Todo.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface todoRepository extends JpaRepository<Todo,Integer> {


}
