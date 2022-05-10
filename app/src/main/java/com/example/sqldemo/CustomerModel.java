package com.example.sqldemo;

public class CustomerModel {
    private int ID;
    private String name;
    private  int age;
    private String activity;

//getters and setters
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    @Override
    public String toString() {
        return "CustomerModel{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", activity='" + activity + '\'' +
                '}';
    }

    public CustomerModel() {
    }

    //constructors
    public CustomerModel(int ID, String name, int age, String activity) {
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.activity = activity;
        //non-parameterised constructor

        //tostringmethod


    }
}
