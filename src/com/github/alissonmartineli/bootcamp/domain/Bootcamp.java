package com.github.alissonmartineli.bootcamp.domain;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

import lombok.Getter;
import lombok.Setter;

public class Bootcamp {

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String description;

    @Getter
    private final LocalDate initalDate = LocalDate.now();

    @Getter
    private final LocalDate endDate = initalDate.plusDays(45);

    @Getter
    @Setter
    private Set<Student> enrolledStudents = new HashSet<>();

    @Getter
    @Setter
    private Set<Content> contents = new LinkedHashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(name, bootcamp.name) && Objects.equals(description, bootcamp.description)
                && Objects.equals(initalDate, bootcamp.initalDate) && Objects.equals(endDate, bootcamp.endDate)
                && Objects.equals(enrolledStudents, bootcamp.enrolledStudents)
                && Objects.equals(contents, bootcamp.contents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, initalDate, endDate, enrolledStudents, contents);
    }
}
