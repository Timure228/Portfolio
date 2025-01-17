package com.example.portfolio.project;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class ProjectConfig {
    @Bean
    CommandLineRunner commandLineRunner(ProjectRepository repository) {
        return args -> {
            Project project1 = new Project(
                    "Project1",
                    "Description",
                    LocalDate.of(2025, 1, 4)
            );
            Project project2 = new Project(
                    "Project2",
                    "Description2",
                    LocalDate.of(2025, 1, 5)

            );
            repository.saveAll(List.of(project1, project2));
        };

    }
}
