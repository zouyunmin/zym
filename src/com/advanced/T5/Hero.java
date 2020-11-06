package com.advanced.T5;

public class Hero {
    private String id;
    private String name;
    private String type;
    private String blood;

    public Hero(String id, String name, String type, String blood) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.blood = blood;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }
}
