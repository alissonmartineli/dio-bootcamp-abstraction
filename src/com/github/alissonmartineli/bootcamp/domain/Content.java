package com.github.alissonmartineli.bootcamp.domain;

import lombok.Getter;
import lombok.Setter;

public abstract class Content {

    protected static final double DEFAULT_XP = 10d;

    @Getter
    @Setter
    private String title;

    @Getter
    @Setter
    private String description;

    public abstract double calculateXp();
}
