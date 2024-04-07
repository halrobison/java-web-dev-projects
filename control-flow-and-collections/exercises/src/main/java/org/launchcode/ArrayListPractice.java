package org.launchcode;
import java.util.Scanner;
import java.util.ArrayList;


public class ArrayListPractice {

        public static void main(String[] args){
            int[] integerArray = {1, 1, 2, 3, 5, 8, 7, 8, 9, 1};
//            String[] stringArray = {"cow", "pig", "fox", "horse"};

            ArrayList<Integer> arrayList = new ArrayList<>();
            for(int item : integerArray){
                arrayList.add(item);
            }
            // Ask Phillip: why can't I initialize like "ArrayList<int>" why do I need to use "ArrayList<Integer>"
            int total = sumEven(arrayList);
            System.out.println("The total sum of all numbers in the array is " + total);

//            ArrayList<String> wordsList = new ArrayList<>();
//            for (String item : stringArray){
//                wordsList.add(item);
//            }


        }
        public static int sumEven(ArrayList<Integer> arr) {
            int total = 0;
            for (int integer : arr) {
                if (integer % 2 == 0) {
                    total += integer;
                }
            }
            return total;
        }

//        public static void fiveLetterFinder(ArrayList<String> arr) {
//            for (String word : arr) {
//                int length = word.length;
//                if (length == 5) {
//                    System.out.println(word);
//                }
//            }
//        }
}
