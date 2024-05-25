package ra.session07_homework.exercise04;

public class ArrayCalculator {
    // Phương thức tĩnh để tính tổng của mảng số nguyên
    public static int sumOfArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    // Phương thức tĩnh để tính tổng của mảng số thực
    public static double sumOfArray(double[] arr) {
        double sum = 0.0;
        for (double num : arr) {
            sum += num;
        }
        return sum;
    }
}
