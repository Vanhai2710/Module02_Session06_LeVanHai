package ra.session07_homework.exercise05;

public class Main {
    public static void main(String[] args) {
        // Tạo mảng số nguyên và số thực để kiểm thử
        int[] intArray = {1, 2, 3, 4, 5};
        double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};

        // Gọi phương thức maxOfArray và minOfArray và in kết quả
        int intMax = ArrayCalculator.maxOfArray(intArray);
        double doubleMax = ArrayCalculator.maxOfArray(doubleArray);
        int intMin = ArrayCalculator.minOfArray(intArray);
        double doubleMin = ArrayCalculator.minOfArray(doubleArray);

        System.out.println("Max of int array: " + intMax);
        System.out.println("Max of double array: " + doubleMax);
        System.out.println("Min of int array: " + intMin);
        System.out.println("Min of double array: " + doubleMin);
    }
}
