package com.scrum.project.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "BusyStatus")

public enum BusyStatus {

    ACTIVE, NOTACTIVE;

    BusyStatus() {

    }



}
