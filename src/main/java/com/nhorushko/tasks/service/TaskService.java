package com.nhorushko.tasks.service;

import com.nhorushko.tasks.domain.Task;

public interface TaskService {

    Iterable<Task> list();

    Task save(Task task);
}
