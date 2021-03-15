package GenericsPractice;

import java.util.List;

public class ArrList {
    public static void arraySubstituter(int[]arr, int a, int b){
        int c = arr[a];
        arr[a] = arr[b];
        arr[b] = c;
    }

    public static void arrToList(int[]arr, List list){
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
    }

}
