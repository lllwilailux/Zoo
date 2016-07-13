package com.wilailux;

/**
 * Created by Wilailux on 7/12/2016.
 */
public class Animal {
    protected String name;
    protected String zone;
    protected String type;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Name: "+name +" Zone: "+zone +" type: "+type;
    }

    public Animal(String name, String zone) {
        this.name = name;
        this.zone = zone;
    }

    public Animal(String name, String zone,String type) {
        this.name = name;
        this.zone = zone;
        this.type = type;
    }

}
