package com.example.sep4_android.entities;

public class Box {
    private String boxName;
    private String description;

    public Box(String name) {
        boxName = name;
    }

    Box(String name, String desc) {
        boxName = name;
        description = desc;
    }

    public String getName() {
        return boxName;
    }

    public String getDescription() {
        return description;
    }
}
