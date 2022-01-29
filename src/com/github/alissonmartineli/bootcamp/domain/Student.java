package com.github.alissonmartineli.bootcamp.domain;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

import lombok.Getter;
import lombok.Setter;

public class Student {

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private Set<Content> subscribedContent = new LinkedHashSet<>();

    @Getter
    @Setter
    private Set<Content> completedContents = new LinkedHashSet<>();

    public void registerBootcamp(Bootcamp bootcamp) {
        this.subscribedContent.addAll(bootcamp.getContents());
        bootcamp.getEnrolledStudents().add(this);
    }

    public void progress() {
        Optional<Content> content = this.subscribedContent.stream().findFirst();
        if (content.isPresent()) {
            this.completedContents.add(content.get());
            this.subscribedContent.remove(content.get());
        } else {
            System.err.println("You are not enrolled in any content!");
        }
    }

    public double calculateTotalXP() {
        return this.completedContents
                .stream()
                .mapToDouble(Content::calculateXp)
                .sum();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Student dev = (Student) o;
        return Objects.equals(name, dev.name) && Objects.equals(subscribedContent, dev.subscribedContent)
                && Objects.equals(completedContents, dev.completedContents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, subscribedContent, completedContents);
    }
}
