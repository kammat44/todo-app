package com.udemyspring.todoapp.model;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Set;


@Entity
@Table(name="task_groups")
public class TaskGroup extends BaseTask {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "group")
    private Set<Task> tasks;

    TaskGroup() {

    }

    public Set<Task> getTasks() {
        return tasks;
    }

    void setTasks(Set<Task> tasks) {
        this.tasks = tasks;
    }
}

