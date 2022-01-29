package com.github.alissonmartineli.bootcamp.domain;

import lombok.Getter;
import lombok.Setter;

public class Course extends Content {

    @Getter
    @Setter
    private int workload;

    @Override
    public double calculateXp() {
        return DEFAULT_XP * workload;
    }

    @Override
    public String toString() {
        return "Course{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", workload=" + workload +
                '}';
    }
}
