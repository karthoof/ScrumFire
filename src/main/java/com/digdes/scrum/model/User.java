package com.scrum.project.model;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Users")
@Data

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name3", length = 30, nullable = false)
    private String name;
    @Column(name = "lastName", length = 40, nullable = false)
    private String lastName;
    @Column(name = "roles")
    @Enumerated(EnumType.STRING)
    private Role roles;
    @Column(name = "status")
    private BusyStatus status;

    public User() {

    }

//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public Role getRoles() {
//        return roles;
//    }
//
//    public void setRoles(Role roles) {
//        this.roles = roles;
//    }
//
//    public BusyStatus getStatus() {
//        return status;
//    }
//
//    public void setStatus(BusyStatus status) {
//        this.status = status;
//    }
}
