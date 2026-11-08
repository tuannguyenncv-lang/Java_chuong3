public class Point2D {
    protected double x;   // protected: lớp con truy cập trực tiếp được
    protected double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() { return x; }
    public double getY() { return y; }

    // Tính khoảng cách giữa 2 điểm
    public double distance(Point2D other) {
        double dx = x - other.x;
        double dy = y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Xác định điểm đối xứng qua gốc tọa độ
    public Point2D symmetric() {
        return new Point2D(-x, -y);
    }

    // Tịnh tiến điểm đi một vị trí với độ lệch dx, dy
    public void translate(double dx, double dy) {
        x += dx;
        y += dy;
    }

    @Override
    public String toString() {
        return String.format("Point2D(%.2f, %.2f)", x, y);
    }
}