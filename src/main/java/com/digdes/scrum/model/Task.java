package com.digdes.scrum.model;
import javax.persistence.*;

@Entity
@Table(name = "Task")

public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", length = 30, nullable = false)
    private String name;
    @Column (name = "description", length = 255, nullable = false)
    private String description;
    @Column(name = "status")
    private TaskStatus status;
    @Column(name = "executer")
    private User executer;
    @Column(name = "sprint")
    private Sprint sprint;

    public Task() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public User getExecuter() {
        return executer;
    }

    public void setExecuter(User executer) {
        this.executer = executer;
    }

    public Sprint getSprint() {
        return sprint;
    }

    public void setSprint(Sprint sprint) {
        this.sprint = sprint;
    }
}
