package ra.session07_homework.exercise01;

public class TestShapes {
    public static void main(String[] args) {
        // Kiểm thử Circle
        Circle circle1 = new Circle(); // Tạo hình tròn với constructor mặc định
        Circle circle2 = new Circle(2.5); // Tạo hình tròn với bán kính 2.5
        Circle circle3 = new Circle(3.5, "blue"); // Tạo hình tròn với bán kính 3.5 và màu xanh

        // In thông tin và diện tích của các hình tròn
        System.out.println(circle1);
        System.out.println("Area: " + circle1.getArea());

        System.out.println(circle2);
        System.out.println("Area: " + circle2.getArea());

        System.out.println(circle3);
        System.out.println("Area: " + circle3.getArea());

        // Kiểm thử Cylinder
        Cylinder cylinder1 = new Cylinder(); // Tạo hình trụ với constructor mặc định
        Cylinder cylinder2 = new Cylinder(2.5); // Tạo hình trụ với bán kính 2.5
        Cylinder cylinder3 = new Cylinder(3.5, 5.0); // Tạo hình trụ với bán kính 3.5 và chiều cao 5.0
        Cylinder cylinder4 = new Cylinder(4.5, 6.0, "green"); // Tạo hình trụ với bán kính 4.5, chiều cao 6.0 và màu xanh lá

        // In thông tin và thể tích của các hình trụ
        System.out.println(cylinder1);
        System.out.println("Volume: " + cylinder1.getVolume());

        System.out.println(cylinder2);
        System.out.println("Volume: " + cylinder2.getVolume());

        System.out.println(cylinder3);
        System.out.println("Volume: " + cylinder3.getVolume());

        System.out.println(cylinder4);
        System.out.println("Volume: " + cylinder4.getVolume());
    }
}
