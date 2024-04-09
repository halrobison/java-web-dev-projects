package org.launchcode;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MenuItem shrimpPasta = new MenuItem("Shrimp Pasta", 8.00, "Shrimp penne pasta in a spicy tomato sauce.", "Main course", new Date("1/1/2024"));
        MenuItem tomatoPasta = new MenuItem("Tomato Pasta", 6.00, "Bowtie pasta in a tomato, onion, garlic sauce with assorted veggies.", "Main course", new Date("1/15/2024"));

        //Menu enriquesPasta = new Menu("Enrique's Pasta"...)

        System.out.println(shrimpTaco);
    }
}


// Menu and MenuItems notes

// Menu: - Public
// MenuItems - Private
    // Get only
// Last Updated - Private
    // Get and set
    // Use Java Date class (has methods at oracle docs)?

// MenuItems: - Private
// Price - Private
    // Get only
    // Use Java Currency class (again check Oracle docs)?
// Description - Private
    // Get only
// Category (Appetizer, Main Course, Dessert) - Private
    // Get only
// New or Not - Private
    // Get and set
