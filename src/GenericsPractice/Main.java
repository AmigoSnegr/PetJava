package GenericsPractice;

import java.util.*;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,6,7,8,9,0};

        ArrList.arraySubstituter(arr, 0, 9);
        System.out.println(Arrays.toString(arr));
        List <Integer> list = new ArrayList<>();
        ArrList.arrToList(arr, list);
        System.out.println(list);

    }

}
