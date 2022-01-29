package com.github.alissonmartineli.bootcamp.domain;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

public class Mentorship extends Content {

    @Getter
    @Setter
    private LocalDate date;

    @Override
    public double calculateXp() {
        return DEFAULT_XP + 20d;
    }

    @Override
    public String toString() {
        return "Mentorship{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", date=" + date +
                '}';
    }
}
