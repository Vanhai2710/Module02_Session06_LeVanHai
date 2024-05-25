package ra.session07_homework.exercise02;

public class Point2D {
    // Thuộc tính x và y, khởi tạo mặc định là 0.0f
    private float x = 0.0f;
    private float y = 0.0f;

    // Constructor mặc định
    public Point2D() {
    }

    // Constructor với tham số x và y
    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Getter cho x
    public float getX() {
        return x;
    }

    // Setter cho x
    public void setX(float x) {
        this.x = x;
    }

    // Getter cho y
    public float getY() {
        return y;
    }

    // Setter cho y
    public void setY(float y) {
        this.y = y;
    }

    // Getter cho cả x và y dưới dạng mảng float
    public float[] getXY() {
        return new float[]{x, y};
    }

    // Setter cho cả x và y
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Phương thức toString
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
