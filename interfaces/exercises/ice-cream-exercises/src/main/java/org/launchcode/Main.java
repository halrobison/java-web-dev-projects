package org.launchcode;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        System.out.println("BEFORE:")
        for (Flavor flavor : flavors) {
            System.out.println(flavor); // note: this will print the info because there's a toString in Ingredients!!
        }
        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name' field.
//        Comparator comparator = new FlavorComparator();
//        flavors.sort(comparator);
//        System.out.println("SORTED:");
//        for (Flavor flavor : flavors) {
//            System.out.println(flavor); // note: this will print the info because there's a toString in Ingredients!!
//        }
        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost' field.

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
    }
}