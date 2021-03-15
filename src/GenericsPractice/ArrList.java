package GenericsPractice;

import java.util.List;
/** Task 1.
 *  Write a method that swaps two elements of an array (the array can be of any reference type);
 *  Task 2.
 *  Write a method that converts an array to an ArrayList;
 * */

public class ArrList {
    public static void arraySubstituter(int[]arr, int a, int b){
        int c = arr[a];
        arr[a] = arr[b];
        arr[b] = c;
    }

    public static void arrToList(int[]arr, List <Integer> list){
        for (int j : arr) {
            list.add(j);
        }
    }

}
