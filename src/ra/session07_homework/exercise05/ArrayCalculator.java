package ra.session07_homework.exercise05;

public class ArrayCalculator {
    // Phương thức tĩnh để tìm giá trị lớn nhất trong mảng số nguyên
    public static int maxOfArray(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Phương thức tĩnh để tìm giá trị lớn nhất trong mảng số thực
    public static double maxOfArray(double[] arr) {
        double max = arr[0];
        for (double num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Phương thức tĩnh để tìm giá trị nhỏ nhất trong mảng số nguyên
    public static int minOfArray(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // Phương thức tĩnh để tìm giá trị nhỏ nhất trong mảng số thực
    public static double minOfArray(double[] arr) {
        double min = arr[0];
        for (double num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}
