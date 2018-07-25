package com.secondbproject.seconddbproject.model;

/**
 * Created by abhi on 24/07/18.
 */
public class SecondTab {

    Integer id;
    String name;
    String city;


    @Override
    public String toString() {
        return "SecondTab{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
