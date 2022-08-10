package com.udemyspring.todoapp.adapter;

import com.udemyspring.todoapp.model.Project;
import com.udemyspring.todoapp.model.ProjectRepository;
import com.udemyspring.todoapp.model.TaskGroup;
import com.udemyspring.todoapp.model.TaskGroupRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
interface SqlProjectRepository extends ProjectRepository, JpaRepository <Project,Integer> {
    @Override
    @Query("select distinct p from Project p join fetch p.steps")
    List<Project> findAll();

}
