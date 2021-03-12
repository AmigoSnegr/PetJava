import java.util.*;

public class Pet_main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)  {
    String s = "100";
    int i = Integer.parseInt(s);
        System.out.println(i);

    }

    public static void doArrayListFilter(){
        List <String> listHw1 = new ArrayList<>();
        listHw1.add("Apple");
        listHw1.add("Orange");
        listHw1.add("Apple");
        listHw1.add("Banana");
        listHw1.add("Melon");
        listHw1.add("Banana");
        listHw1.add("Pineapple");
        listHw1.add("Apple");
        listHw1.add("Strawberry");
        listHw1.add("Blueberry");
        listHw1.add("Melon");
        listHw1.add("Lemon");
        listHw1.add("Apple");
        listHw1.add("Apple");
        System.out.println(listHw1.toString());
        List fruits = new ArrayList();
        for (String fruit : listHw1){
            if(fruits.contains(fruit)){}
            else {fruits.add(fruit);
            }
        }
        listHw1 = fruits;
        System.out.println(listHw1.toString());
    }
    public static int getNumberFromScanner(String message, int min, int max) {
        int x;
        do {
            System.out.println(message);
            x = sc.nextInt();
        } while (x < min || x > max);
        return x;
    }
    private static int summ(int i, int i1) {
        return i + i1;
    }
    private static int l1HwT1(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }
    private static boolean l1HwT2(int a, int b) {
        if (a + b <= 20 && a + b >= 10) {
            return true;
        } else {
            return false;
        }
    }
    private static void l1HwT3(int a) {
        if (a >= 0) {
            System.out.println("Число положительное!");
        } else if (a < 0) {
            System.out.println("Число отрицательное!");
        }
    }
    private static boolean l1HwT4(int a) {
        if (a >= 0) {
            return false;
        } else return true;
    }
    /*Задать целочисленный массив, состоящий из элементов 0 и 1. Например:
     [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;*/
    private static void l2HwT1(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                a[i] += 1;
            } else {
                a[i] -= 1;}
        }
    } // takes array with 0s and 1s, replaces 0 with 1 and vice verse
    /*Задать пустой целочисленный массив размером 8. С помощью цикла
     заполнить его значениями 0 3 6 9 12 15 18 21;
     */
    private static void l2HwT2(int[]a){
        for (int i = 0; i < a.length; i++) {
            a[i] = i * 3;
        }
    } //array gonna be filled with numbers, which can be divided by 3 in ascending order
    /*Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
     и числа меньшие 6 умножить на 2;
     */
    private static void l2HwT3(int[]a){
        for (int i = 0; i < a.length; i++) {
            if(a[i] < 6){a[i] *= 2;}
        }

    } //all the numbers in array, which are lower then 6 will be multiplied by 2
    /*Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
     и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно
     только одну из диагоналей, если обе сложно). Определить элементы одной
      из диагоналей можно по следующему принципу: индексы таких элементов равны,
       то есть [0][0], [1][1], [2][2], …, [n][n];
     */
    private static void l2HwT4(int[][]a){
        for (int i = 0; i < a.length; i++) {
            a[i][i] = 1;
            a[i][a.length - 1 - i] = 1;
        }
    } //feeling a 2d array's diagonals with 1s
    public static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
    private static int findMin(int[] array) {
        int min = array[0];
        for (int oneElementOfThisArray : array){
            if (oneElementOfThisArray < min)
                min = oneElementOfThisArray;
        }
        return min;
    } //find the lowest number in array
    private static int findMAX(int[] array){
        int max = array[0];
        for (int oneElementOfThisArray : array) {
            if (oneElementOfThisArray > max)
                max = oneElementOfThisArray;
        }
        return max;
    } //find the highest number in array
    public static void print2DArray(int[][] arr) {
        for (int i = 0; i <= arr[0].length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    } //print a 2d array with a numbering of rows and columns

}