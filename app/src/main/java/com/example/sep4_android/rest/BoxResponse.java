package com.example.sep4_android.rest;

import com.example.sep4_android.entities.Box;

public class BoxResponse {
    /**
     * idk if its needed, kasper had it in his example but I didnt use ir at the end
     *
     */
    private String id;

    private boolean light;
    private boolean locked;

    private String userId;

    public Box getBox(){
        return new Box(id, userId, locked, light);
    }
}
