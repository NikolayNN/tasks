package com.nhorushko.tasks.repository;

import com.nhorushko.tasks.domain.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Long>{
}
