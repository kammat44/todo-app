package com.udemyspring.todoapp.model;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;


@Entity
@Table(name="tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank(message = "Tasks description must be not null")
    private String description;
    private boolean done;

    private LocalDateTime deadLine;

    private LocalDateTime createdOn;
    private LocalDateTime updatedOn;
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


    public void updateFrom(final Task source){
        description = source.description;
        done =source.done;
        deadLine = source.deadLine;

    }

    @PrePersist
    void prePersist(){
        createdOn = LocalDateTime.now();
    }

    @PreUpdate
    void preMerge(){
        updatedOn = LocalDateTime.now();
    }



}

