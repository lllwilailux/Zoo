package com.wilailux;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Wilailux on 7/13/2016.
 */
public class Main {
    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();
        animals.add(new Omnivore("bear", "mammalsZone", "omnivore"));
        animals.add(new Herbivore("hippopotamus", "mammalsZone", "herbivore"));
        animals.add(new Herbivore("elephant", "mammalsZone", "herbivore"));
        animals.add(new Herbivore("panda", "mammalsZone", "herbivore"));
        animals.add(new Omnivore("skunk", "mammalsZone", "omnivore"));
        animals.add(new Omnivore("sloth", "mammalsZone", "omnivore"));
        animals.add(new Omnivore("raccoon", "mammalsZone", "omnivore"));
        animals.add(new Omnivore("chimpanzee", "mammalsZone", "omnivore"));

        animals.add(new Carnivore("falcon", "birdsZone", "carnivore"));
        animals.add(new Herbivore("parrot", "birdsZone", "herbivore"));

        animals.add(new Herbivore("whale", "aquaticZone", "herbivore"));
        animals.add(new Carnivore("dolphin", "aquaticZone", "carnivore"));

        animals.add(new Carnivore("snake", "reptileZone", "carnivore"));
        animals.add(new Carnivore("alligator", "reptileZone", "carnivore"));
        animals.add(new Carnivore("crocodile", "reptileZone", "carnivore"));


        System.out.println("++++++++++++++++This is my ZOO++++++++++++++++++++");
        System.out.println("");

        for(int i=0;i<animals.size();i++){
            if (animals.get(i).getType().equals("carnivore")){
            System.out.println(" Dew is staff of carnivore " + animals.get(i).toString());}
        }

        System.out.println("");
        System.out.println("++++++++++++++++++++++++++++++++++++");
        System.out.println("");

        for(int i=0;i<animals.size();i++){
            if (animals.get(i).getType().equals("herbivore")){
                System.out.println(" Miew is staff of carnivore " + animals.get(i).toString());}
        }

        System.out.println("");
        System.out.println("++++++++++++++++++++++++++++++++++++");
        System.out.println("");

        for(int i=0;i<animals.size();i++){
            if (animals.get(i).getType().equals("omnivore")){
                System.out.println(" Palm is staff of carnivore " + animals.get(i).toString());}
        }

        Employee em1 = new Employee();
        em1.setEmployee("Dew","carnivore");

        Employee em2 = new Employee();
        em1.setEmployee("Miew","herbivore");

        Employee em3 = new Employee();
        em1.setEmployee("Palm","omnivore");

    }
}
