package com.digdes.scrum.model;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Task")
@Data

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

}
