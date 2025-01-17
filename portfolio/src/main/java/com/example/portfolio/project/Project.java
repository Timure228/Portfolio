package com.example.portfolio.project;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table
public class Project {
    @Id
    @SequenceGenerator(
            name = "project_sequence",
            sequenceName = "project_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "project_sequence"
    )
    private Long id;
    private String name;
    private String description;
    private LocalDate release_date;

    public Project() {
    }

    public Project(Long id, String name, String description, LocalDate release_date) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.release_date = release_date;
    }

    public Project(String name, String description, LocalDate release_date) {
        this.name = name;
        this.description = description;
        this.release_date = release_date;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getRelease_date() {
        return release_date;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setRelease_date(LocalDate release_date) {
        this.release_date = release_date;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", release_date=" + release_date +
                '}';
    }
}
