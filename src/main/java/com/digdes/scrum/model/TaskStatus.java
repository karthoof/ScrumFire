package com.digdes.scrum.model;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TaskStatus")


public enum TaskStatus {

    BACKLOG, TODO, INPROGRESS, CODEREVIEW, TEST, RELEASE;

    TaskStatus() {

    }



}
