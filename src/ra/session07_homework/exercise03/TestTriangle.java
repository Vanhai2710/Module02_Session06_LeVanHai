package ra.session07_homework.exercise03;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Tạo đối tượng Scanner để nhận đầu vào từ người dùng

        // Hỏi người dùng nhập độ dài cạnh thứ nhất của tam giác
        System.out.print("Enter side1: ");
        double side1 = scanner.nextDouble();

        // Hỏi người dùng nhập độ dài cạnh thứ hai của tam giác
        System.out.print("Enter side2: ");
        double side2 = scanner.nextDouble();

        // Hỏi người dùng nhập độ dài cạnh thứ ba của tam giác
        System.out.print("Enter side3: ");
        double side3 = scanner.nextDouble();
        scanner.nextLine();  // Tiêu thụ ký tự newline còn lại

        // Hỏi người dùng nhập màu sắc của tam giác
        System.out.print("Enter the color: ");
        String color = scanner.nextLine();

        // Hỏi người dùng nhập trạng thái đầy hay rỗng của tam giác
        System.out.print("Is the triangle filled? (true/false): ");
        boolean filled = scanner.nextBoolean();

        // Tạo đối tượng Triangle với các giá trị đã nhập
        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);
        triangle.setFilled(filled);

        // In ra thông tin của tam giác
        System.out.println("The triangle details are:");
        System.out.println("Color: " + triangle.getColor());
        System.out.println("Filled: " + triangle.isFilled());
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println(triangle.toString());

        scanner.close(); // Đóng đối tượng Scanner
    }
}
