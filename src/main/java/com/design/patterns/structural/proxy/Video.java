package com.design.patterns.structural.proxy;

public class Video {
    private Long id;
    private String name;
    private String description;

    public Video(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Id: " + id + ", Name: " + name + ", Description: " + description;
    }

    public Long getId() {
        return id;
    }
}
