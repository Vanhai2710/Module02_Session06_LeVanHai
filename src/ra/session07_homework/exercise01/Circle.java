package ra.session07_homework.exercise01;

public class Circle {
    private double radius; // Thuộc tính bán kính của hình tròn
    private String color;  // Thuộc tính màu sắc của hình tròn

    // Các constructor

    // Constructor mặc định, tạo hình tròn với bán kính 1.0 và màu đỏ
    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    // Constructor tạo hình tròn với bán kính tùy chỉnh và màu đỏ
    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
    }

    // Constructor tạo hình tròn với bán kính và màu sắc tùy chỉnh
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // Getter và setter cho bán kính
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter và setter cho màu sắc
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Phương thức tính diện tích của hình tròn
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Phương thức toString để trả về thông tin chi tiết của hình tròn
    @Override
    public String toString() {
        return "Circle[radius=" + radius + ", color=" + color + "]";
    }
}
