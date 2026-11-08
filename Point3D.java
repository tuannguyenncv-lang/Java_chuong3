public class Point3D extends Point2D {
    private double z;

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() { return z; }

    // Tính khoảng cách giữa 2 điểm 3D (overload)
    public double distance(Point3D other) {
        double dx = x - other.x;
        double dy = y - other.y;
        double dz = z - other.z;
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }

    @Override
    public Point3D symmetric() {
        return new Point3D(-x, -y, -z);
    }

    // Tịnh tiến điểm đi một vị trí với độ lệch dx, dy và dz
    public void translate(double dx, double dy, double dz) {
        super.translate(dx, dy);
        z += dz;
    }

    @Override
    public String toString() {
        return String.format("Point3D(%.2f, %.2f, %.2f)", x, y, z);
    }
}