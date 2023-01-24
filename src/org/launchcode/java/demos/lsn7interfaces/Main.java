package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.

        Collections.sort(flavors);


        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.

        Collections.sort(cones,
                new Cone("Waffle", 1.25, new ArrayList<>(Arrays.asList( "gluten")))
        );

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
        System.out.println(flavors);
        System.out.println(cones);
    }
}
