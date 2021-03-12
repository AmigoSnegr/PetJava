package ExceptionPractice;

public class test {
    public static void main(String[] args) {
        MatrixArrayChecker matrixArrayChecker = new MatrixArrayChecker();
        String[][] matrix = {
                {"1", "2", "3", "A"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };
        String[][] matrix1 = {
                {"1", "2", "3", "4"},
                {"1", "2"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };


        try {
            matrixArrayChecker.checkSize(matrix1);
            matrixArrayChecker.valueToInt(matrix1);
        } catch (MyArraySizeException e) {
            System.out.println(String.format("Array size is improper: %s", e.getMessage()));
        } catch (MyArrayDataException e) {
            System.out.println(String.format("Array value is not integer: %s", e.getMessage()));
        }

        try {
            matrixArrayChecker.checkSize(matrix);
            matrixArrayChecker.valueToInt(matrix);
        } catch (MyArraySizeException e) {
            System.out.println(String.format("Array size is improper: %s", e.getMessage()));
        } catch (MyArrayDataException e) {
            System.out.println(String.format("Array value is not integer: %s", e.getMessage()));
        }
    }
}
