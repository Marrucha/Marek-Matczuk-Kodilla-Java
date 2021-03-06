package com.kodilla.hibernate.tasklist;
import com.kodilla.hibernate.task.Task;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.*;

@Entity (name = "taskList")
@Table (name = "TASKLIST")
public class TaskList {
    private int id;
    private String listName;
    private String description;
    private List<Task> tasks = new ArrayList<>();

    @OneToMany (targetEntity = Task.class, mappedBy = "taskList", cascade = CascadeType.ALL, fetch = FetchType.LAZY )
    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public TaskList(String listName, String description) {
        this.listName = listName;
        this.description = description;
    }
    public TaskList(){}

    @Id
    @NotNull
    @GeneratedValue
    @Column(name ="ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Column (name = "LISTNAME")
    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    @Column (name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
