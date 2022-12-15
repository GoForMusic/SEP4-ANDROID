package com.example.sep4_android.entities;

public class Box {

    private String id;
    private String userId;
    private boolean light;
    private boolean locked;
    private String presetId;



    public Box(String id, String userId, boolean light, boolean locked, String presetId)
    {
        this.presetId=presetId;
        this.id=id;
        this.userId=userId;
        this.light=light;
        this.locked=locked;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public boolean isLight() {
        return light;
    }

    public void setLight(boolean light) {
        this.light = light;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    public String getPresetId() {
        return presetId;
    }

    public void setPresetId(String presetId) {
        this.presetId = presetId;
    }
}
