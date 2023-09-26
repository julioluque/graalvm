package ar.com.jluque;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GraalvmApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraalvmApplication.class, args);
	}

	@Bean
	CommandLineRunner commmandLineRunner(TodoRepository todoRepository) {

		Todo todo1 = new Todo();
		todo1.setName("nombre 1");
		Todo todo2 = new Todo();
		todo2.setName("nombre 2");
		Todo todo3 = new Todo();
		todo3.setName("nombre 3");

		return args -> todoRepository.saveAll(Arrays.asList(todo1, todo2, todo3));
	}
}
