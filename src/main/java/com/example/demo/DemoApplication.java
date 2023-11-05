package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	@Bean
	public CommandLineRunner init(TodoRepository todoRepository) {
		return args -> {
			Todo todo1 = new Todo();
			todo1.setTitle("Buy groceries");
			todo1.setDescription("Milk, bread, eggs, cheese");
			todo1.setDone(false);
			todoRepository.save(todo1);

			Todo todo2 = new Todo();
			todo2.setTitle("Do laundry");
			todo2.setDescription("Wash clothes, dry clothes, fold clothes");
			todo2.setDone(false);
			todoRepository.save(todo2);

			Todo todo3 = new Todo();
			todo3.setTitle("Clean house");
			todo3.setDescription("Vacuum floors, dust furniture, wash dishes");
			todo3.setDone(false);
			todoRepository.save(todo3);
		};
	}
}