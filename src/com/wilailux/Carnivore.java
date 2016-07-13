package com.wilailux;

/**
 * Created by Wilailux on 7/13/2016.
 */
public class Carnivore extends Animal implements FeedCarnivore{

    public Carnivore() {
    }

    public Carnivore(String name) {
        super(name);
    }

    public Carnivore(String name, String zone, String type) {
        super(name, zone, type);
    }

    @Override
    public void feedMeat() {
        System.out.print("There are already eat meat");
    }

}
