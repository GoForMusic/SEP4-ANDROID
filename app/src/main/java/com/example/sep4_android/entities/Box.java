package com.example.sep4_android.entities;

public class Box {
    private String boxName;
    private String description;
    private String id;
    private String userId;
    private boolean light;
    private boolean locked;
    public Box(String name) {
        boxName = name;
    }

    Box(String name, String desc) {
        boxName = name;
        description = desc;
    }

    public Box(String id, String userId, boolean light, boolean locked)
    {
        this.id=id;
        this.userId=userId;
        this.light=light;
        this.locked=locked;
    }

    public String getName() {
        return boxName;
    }

    public String getDescription() {
        return description;
    }
}
