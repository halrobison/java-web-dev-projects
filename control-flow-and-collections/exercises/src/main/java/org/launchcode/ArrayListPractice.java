package org.launchcode;
import java.util.ArrayList;


public class ArrayListPractice {

        public static int main(String[] args){
            int[] integerArray = {1, 1, 2, 3, 5, 8, 7, 8, 9, 1};
            ArrayList<Integer> arrayList = new ArrayList<>();
            for(int item : integerArray){
                arrayList.add(item);
            }
            // Ask Phillip: why can't I initialize like "ArrayList<int>" why do I need to use "ArrayList<Integer>"
            int total = sumEven(arrayList);
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
}
