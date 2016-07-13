package com.wilailux;

/**
 * Created by Wilailux on 7/13/2016.
 */
public class Herbivore extends Animal implements FeedHerbivore{

    public Herbivore() {
    }

    public Herbivore(String name) {
        super(name);
    }

    public Herbivore(String name, String zone, String type) {
        super(name, zone, type);
    }

    @Override
    public void feedHerb() {
        System.out.print("There are already eat herbal");
    }
}
