package com.nhorushko.tasks;

import com.nhorushko.tasks.domain.Task;
import com.nhorushko.tasks.service.TaskService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class TasksApplication {

	public static void main(String[] args) {
		SpringApplication.run(TasksApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(TaskService taskService){
		return args -> {
			taskService.save(new Task(1L, "Create SpringBoot Application", LocalDate.now(), true));
			taskService.save(new Task(2L, "Create SpringBoot packages", LocalDate.now(), false));
			taskService.save(new Task(3L, "Create the Task domain class", LocalDate.now(), false));
			taskService.save(new Task(4L, "Create service and repositories classes", LocalDate.now(), false));
			taskService.save(new Task(5L, "Create the command line runner to load data", LocalDate.now(), false));
			taskService.save(new Task(6L, "Create the required configuration properties", LocalDate.now(), false));
			taskService.save(new Task(2L, "Run the SpringBoot application", LocalDate.now(), false));
			taskService.save(new Task(2L, "Check the H2 Console for the initial data", LocalDate.now(), false));
		};
	}
}
