package ra.session07_homework.exercise02;

public class TestPoints {
    public static void main(String[] args) {
        // Kiểm thử Point2D
        Point2D point2D1 = new Point2D();
        Point2D point2D2 = new Point2D(3.0f, 4.0f);

        System.out.println("Point2D:");
        System.out.println(point2D1);
        System.out.println("X: " + point2D1.getX() + ", Y: " + point2D1.getY());

        System.out.println(point2D2);
        System.out.println("X: " + point2D2.getX() + ", Y: " + point2D2.getY());

        point2D2.setXY(5.0f, 6.0f);
        System.out.println("Updated " + point2D2);
        System.out.println("Array XY: " + java.util.Arrays.toString(point2D2.getXY()));

        // Kiểm thử Point3D
        Point3D point3D1 = new Point3D();
        Point3D point3D2 = new Point3D(1.0f, 2.0f, 3.0f);

        System.out.println("\nPoint3D:");
        System.out.println(point3D1);
        System.out.println("X: " + point3D1.getX() + ", Y: " + point3D1.getY() + ", Z: " + point3D1.getZ());

        System.out.println(point3D2);
        System.out.println("X: " + point3D2.getX() + ", Y: " + point3D2.getY() + ", Z: " + point3D2.getZ());

        point3D2.setXYZ(7.0f, 8.0f, 9.0f);
        System.out.println("Updated " + point3D2);
        System.out.println("Array XYZ: " + java.util.Arrays.toString(point3D2.getXYZ()));
    }
}
