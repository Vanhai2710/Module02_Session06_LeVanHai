package ra.session07_homework.exercise03;

public class Triangle extends Shape{
    private double side1; // Trường dữ liệu side1 để lưu độ dài cạnh thứ nhất của tam giác
    private double side2; // Trường dữ liệu side2 để lưu độ dài cạnh thứ hai của tam giác
    private double side3; // Trường dữ liệu side3 để lưu độ dài cạnh thứ ba của tam giác

    // Phương thức khởi tạo không có tham số, mặc định độ dài các cạnh là 1.0
    public Triangle() {
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }

    // Phương thức khởi tạo có tham số, nhận giá trị cho độ dài các cạnh
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Phương thức lấy giá trị side1
    public double getSide1() {
        return side1;
    }

    // Phương thức đặt giá trị cho side1
    public void setSide1(double side1) {
        this.side1 = side1;
    }

    // Phương thức lấy giá trị side2
    public double getSide2() {
        return side2;
    }

    // Phương thức đặt giá trị cho side2
    public void setSide2(double side2) {
        this.side2 = side2;
    }

    // Phương thức lấy giá trị side3
    public double getSide3() {
        return side3;
    }

    // Phương thức đặt giá trị cho side3
    public void setSide3(double side3) {
        this.side3 = side3;
    }

    // Phương thức tính diện tích tam giác dựa vào công thức Heron
    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // Phương thức tính chu vi tam giác
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    // Phương thức toString trả về thông tin của tam giác dưới dạng chuỗi
    @Override
    public String toString() {
        return "Triangle[side1=" + side1 + ", side2=" + side2 + ", side3=" + side3 + ", color=" + getColor() + ", filled=" + isFilled() + "]";
    }
}
