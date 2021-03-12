package MultithreadPractice;
public class Main {
    /**The goal of program is to see the difference between straight calculation and separated into halfs and
    then calculated in 2 threads, then building calculated parts back into a one array*/
    public static void main(String[] args) {
            new toDoMethod().calc();
            new ArrMultiCalc().calc();
    }
}
