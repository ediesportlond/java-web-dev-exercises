package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Flavor extends Ingredient implements Comparator<Flavor>, Comparable<Flavor> {


    public Flavor(String aName, double aCost, ArrayList<String> someAllergens){
        super (aName, aCost, someAllergens);
    }

    @Override
    public int compareTo(Flavor f) {
        return (this.getName()).compareTo(f.getName());
    }

    @Override
    public int compare(Flavor f, Flavor f1) {
        double diff = (f.getCost() - f1.getCost());
        if(diff < 0){
            return - 1;
        } else if (diff > 0){
            return 1;
        } else {
            return 0;
        }
    }
}
