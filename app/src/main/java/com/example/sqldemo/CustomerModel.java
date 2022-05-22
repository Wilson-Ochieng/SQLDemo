package com.example.sqldemo;

public class CustomerModel {
    private int ID;
    private String cname;
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
        return cname;
    }

    public void setName(String name) {
        this.cname = name;
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
                ", firstname='" + cname + '\'' +
                ", age=" + age +
                ", activity='" + activity + '\'' +
                '}';
    }

    public CustomerModel() {
    }

    //constructors
    public CustomerModel(int ID, String name, int age, String activity) {
        this.ID = ID;
        this.cname = name;
        this.age = age;
        this.activity = activity;
        //non-parameterised constructor

        //tostringmethod


    }
}
