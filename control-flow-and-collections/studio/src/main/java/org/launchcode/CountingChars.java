package org.launchcode;
import java.util.HashMap;
import java.util.Map;

public class CountingChars {
    public static void main(String[] args) {
        // initialize string
        // loop through string one char at a time
        // store and/or update the count for a given character with an appropriate data structure
        // loop through the data structure to print the results (one char and count per line)


    // first, the data we will use:
    String quote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

    // then, initialize array we can iterate through to look through all text, one char at a time.
    char[] charArray = quote.toCharArray();

    HashMap<Character, Integer> Counts = new HashMap<>();

    for (char letter : charArray) {
        if(Counts.containsKey(letter)) {
            Counts.put(letter, Counts.get(letter) + 1);
        } else {
            Counts.put(letter, 1);
        }
    }

    for (Map.Entry<Character, Integer> count : Counts.entrySet()) {
        System.out.println(count.getKey() + " : " + count.getValue());
    }

    }
}
