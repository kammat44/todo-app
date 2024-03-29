package com.udemyspring.todoapp.model;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Set;


@Entity
@Table(name="task_groups")
public class TaskGroup extends BaseTask {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "group")
    private Set<Task> tasks;
    @ManyToOne
    @JoinColumn (name = "project_id")
    private Project project;
    public TaskGroup() {
    }
    public Set<Task> getTasks() {
        return tasks;
    }
    public void setTasks(Set<Task> tasks) {
        this.tasks = tasks;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
}

