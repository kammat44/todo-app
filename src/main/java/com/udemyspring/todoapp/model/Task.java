package com.udemyspring.todoapp.model;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;


@Entity
@Table(name="tasks")
public class Task{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank(message = "Tasks description must be not null")
    private String description;
    private boolean done;

    private LocalDateTime deadLine;

    @ManyToOne
    @JoinColumn (name = "task_group_id")
    private TaskGroup group;

    @Embedded
    private Audit audit =new Audit();

    Task() {
    }

    public String getDescription() {
        return description;
    }


    void setDescription(final String description) {
        this.description = description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(final boolean done) {
        this.done = done;
    }

    public int getId() {
        return id;
    }

    void setId(final int id) {
        this.id = id;
    }

    public LocalDateTime getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(LocalDateTime deadLine) {
        this.deadLine = deadLine;
    }

    TaskGroup getGroup() {
        return group;
    }


    public void updateFrom(final Task source){
        description = source.description;
        done =source.done;
        deadLine = source.deadLine;
        group = source.group;
    }





}

