package ra.session07_homework.exercise04;

public class Main {
    public static void main(String[] args) {
        // Tạo mảng số nguyên và số thực để kiểm thử
        int[] intArray = {1, 2, 3, 4, 5};
        double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};

        // Gọi phương thức sumOfArray và in kết quả
        int intSum = ArrayCalculator.sumOfArray(intArray);
        double doubleSum = ArrayCalculator.sumOfArray(doubleArray);

        System.out.println("Sum of int array: " + intSum);
        System.out.println("Sum of double array: " + doubleSum);
    }
}
