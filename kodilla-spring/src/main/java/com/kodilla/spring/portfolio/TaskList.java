package com.kodilla.spring.portfolio;

import java.util.*;

public class TaskList {
    public List<String> tasks;

    public TaskList() {
        this.tasks = new ArrayList<String>();
    }

    public List<String> getTasksList() {
        return tasks;
    }
}
