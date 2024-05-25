package ra.session07_homework.exercise02;

public class Point3D extends Point2D {
    // Thuộc tính z, khởi tạo mặc định là 0.0f
    private float z = 0.0f;

    // Constructor mặc định

    public Point3D() {
        super();
    }

    // Constructor với tham số x, y và z

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    // Getter cho z

    public float getZ() {
        return z;
    }

    // Getter cho cả x, y và z dưới dạng mảng float
    public float[] getXYZ() {
        return new float[]{getX(), getY(), z};
    }

    // Setter cho cả X,y,z

    public void setXYZ(float x, float y, float z) {
        setXY(x, y);
        this.z = z;
    }

    // Phương thức toSring
    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ", " + z + ")";
    }
}
