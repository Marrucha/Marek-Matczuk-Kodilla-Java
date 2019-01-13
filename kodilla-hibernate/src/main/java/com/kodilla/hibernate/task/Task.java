package com.kodilla.hibernate.task;
import com.kodilla.hibernate.tasklist.TaskList;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.*;

@Entity
@Table(name = "TASKS")
public class Task {
    private int id;
    private String description;
    private Date created;
    private int duration;
    private TaskFinancialDetails taskFinancialDetails;
    private TaskList taskList;

    @ManyToOne
    @JoinColumn (name = "TASKLIST_ID")
    public TaskList getTasklist() {
        return taskList;
    }

    public void setTaskList(TaskList tasklist) {
        this.taskList = tasklist;
    }

    public Task(String description, int duration) {
        this.description = description;
        this.created = new Date();
        this.duration = duration;
    }

    public Task(){
    };


    public void setTaskFinancialDetails(TaskFinancialDetails taskFinancialDetails) {
        this.taskFinancialDetails = taskFinancialDetails;
    }

    @OneToOne (cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn (name = "TASK_FINANCIALS_ID")
    public TaskFinancialDetails getTaskFinancialDetails() {
        return taskFinancialDetails;
    }


    private void setId(int id) {
        this.id = id;
    }

    private void setDescription(String description) {
        this.description = description;
    }

    private void setCreated(Date created) {
        this.created = created;
    }

    private void setDuration(int duration) {
        this.duration = duration;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name="ID", unique = true)
    public int getId() {
        return id;
    }

    @Column (name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }

    @NotNull
    @Column(name = "CREATED")
    public Date getCreated() {
        return created;
    }

    @Column(name = "DURATION")
    public int getDuration() {
        return duration;
    }
}
