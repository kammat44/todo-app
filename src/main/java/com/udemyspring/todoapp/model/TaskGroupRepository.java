package com.udemyspring.todoapp.model;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface TaskGroupRepository {
    List<TaskGroup> findAll();
    Optional<TaskGroup> findById(Integer id);
    Task save(Task entity);

    boolean existsByDoneIsFalseAndProject_Id(Integer projectId);
}

