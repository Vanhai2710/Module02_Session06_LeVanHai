package ra.session07_homework.exercise03;

public class Shape {
    private String color;
    private boolean filled;

    // phương thức khởi tạo không có tham số, mặc định color là "green" và filled là true

    public Shape() {
        this.color = "green";
        this.filled = true;
    }

    // phương thức khởi tạo có tham số, nhận giá trị cho color và filled

    public String getColor() {
        return color;
    }

    // phuwong thức đặt giá trị cho color

    public void setColor(String color) {
        this.color = color;
    }

    // Phương thức kiểm tra xem hình có đầy hay không
    public boolean isFilled() {
        return filled;
    }

    //phương thức đặt giá trị cho filled

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // phương thức toString

    @Override
    public String toString() {
        return "Shape[color=" + color + ",filled=" + filled + "]";
    }
}
