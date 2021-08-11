package com.example.navcontroller.fragments;

public class User {
    private String name;
    private int age;
    private String surName;
    private int image;
    private String type;

    public User(String name, int age, String surName, int image, String type) {
        this.name = name;
        this.age = age;
        this.surName = surName;
        this.image = image;
        this.type = type;
    }

    public User(String name, int age, String surName, String type) {
        this.name = name;
        this.age = age;
        this.surName = surName;
        this.type = type;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
