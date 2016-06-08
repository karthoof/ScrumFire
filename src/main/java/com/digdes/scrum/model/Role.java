package com.scrum.project.model;

import javax.persistence.Entity;
import javax.persistence.Table;

// убрать таблицу и сущность в енуме

public enum Role {

    PRODUCTOWNER, SCRUMMASTER, DEVELOPER, TESTER;

    Role() {

    }



}
