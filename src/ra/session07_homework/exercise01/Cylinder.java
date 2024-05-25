package ra.session07_homework.exercise01;

public class Cylinder extends Circle {
    private double height; // Thuộc tính chiều cao của hình trụ

    // Các constructor

    // Constructor mặc định, tạo hình trụ với bán kính 1.0, màu đỏ và chiều cao 1.0
    public Cylinder() {
        super(); // Gọi constructor của lớp Circle
        this.height = 1.0;
    }

    // Constructor tạo hình trụ với bán kính tùy chỉnh, màu đỏ và chiều cao 1.0
    public Cylinder(double radius) {
        super(radius); // Gọi constructor của lớp Circle
        this.height = 1.0;
    }

    // Constructor tạo hình trụ với bán kính và chiều cao tùy chỉnh, màu đỏ
    public Cylinder(double radius, double height) {
        super(radius); // Gọi constructor của lớp Circle
        this.height = height;
    }

    // Constructor tạo hình trụ với bán kính, chiều cao và màu sắc tùy chỉnh
    public Cylinder(double radius, double height, String color) {
        super(radius, color); // Gọi constructor của lớp Circle
        this.height = height;
    }

    // Getter và setter cho chiều cao
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Phương thức tính thể tích của hình trụ
    public double getVolume() {
        return getArea() * height; // Thể tích = diện tích đáy * chiều cao
    }

    // Phương thức toString để trả về thông tin chi tiết của hình trụ
    @Override
    public String toString() {
        return "Cylinder[" + super.toString() + ", height=" + height + "]";
    }
}

