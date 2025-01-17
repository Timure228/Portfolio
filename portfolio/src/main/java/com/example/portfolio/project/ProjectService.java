package com.example.portfolio.project;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class ProjectService {

    private final ProjectRepository projectRepository;

    @Autowired
    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }


    public List<Project> getProjects() {
        return projectRepository.findAll();
    }

    public void addNewProject(Project project) {
        projectRepository.save(project);
    }

    public void deleteProject(Long projectId) {
        boolean exists = projectRepository.existsById(projectId);
        if (!exists) {
            throw new IllegalStateException("Project with id " + projectId + "doesn't exist");

        }
        projectRepository.deleteById(projectId);
    }

    @Transactional
    public void updateProject(Long projectId, String name, String description) {
        Project project = projectRepository.findById(projectId).orElseThrow(() -> new IllegalStateException("Project with id " + projectId + " doesn't exist"));

        if (name != null && name.length() > 0 && !Objects.equals(project.getName(), name)) {
            project.setName(name);
        }

        if (description != null && description.length() > 0 && !Objects.equals(project.getDescription(), description)) {
            Optional<Project> projectOptional = projectRepository.findProjectByDescription(description);
            if (projectOptional.isPresent()) {
                throw new IllegalStateException("description taken");
            }
            project.setDescription(description);
        }
    }
}
