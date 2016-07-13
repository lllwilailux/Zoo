package com.wilailux;

/**
 * Created by Wilailux on 7/13/2016.
 */
public class Omnivore extends Animal implements FeedCarnivore,FeedHerbivore{


    public Omnivore(String name, String zone, String type) {
        super(name, zone, type);
    }

    public Omnivore(String name) {
        super(name);
    }

    @Override
    public void feedMeat() {
        System.out.print("There are already eat meat, ");
    }

    @Override
    public void feedHerb() {
        System.out.print("There are already eat herbal");
    }

}
