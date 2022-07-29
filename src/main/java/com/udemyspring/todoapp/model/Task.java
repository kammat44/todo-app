package com.udemyspring.todoapp.model;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;


@Entity
@Table(name="tasks")
public class Task extends BaseTask{

    @ManyToOne
    @JoinColumn (name = "task_group_id")
    private TaskGroup group;

    Task() {
    }

    TaskGroup getGroup() {
        return group;
    }







}

