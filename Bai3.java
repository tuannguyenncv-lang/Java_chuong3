import java.util.ArrayList;
import java.util.List;

public class Bai3 {
    public static void main(String[] args) {
        // Tạo một danh sách điểm bao gồm 2D và 3D
        List<Point2D> points = new ArrayList<>();
        points.add(new Point2D(1, 2));
        points.add(new Point2D(4, 6));
        points.add(new Point2D(-3, 5));
        points.add(new Point3D(1, 2, 3));
        points.add(new Point3D(4, 6, 8));
        points.add(new Point3D(-1, 0, 2));

        // Tính tổng khoảng cách các điểm 2D và tổng khoảng cách các điểm 3D
        // (khoảng cách giữa các điểm liên tiếp trong từng nhóm)
        double sum2D = 0, sum3D = 0;
        Point2D prev2D = null;
        Point3D prev3D = null;

        for (Point2D p : points) {
            if (p instanceof Point3D) {
                Point3D cur = (Point3D) p;
                if (prev3D != null) sum3D += prev3D.distance(cur);
                prev3D = cur;
            } else {
                if (prev2D != null) sum2D += prev2D.distance(p);
                prev2D = p;
            }
        }
        System.out.printf("Tong khoang cach cac diem 2D: %.4f%n", sum2D);
        System.out.printf("Tong khoang cach cac diem 3D: %.4f%n", sum3D);

        // Đưa các điểm đối xứng vào danh sách (duyệt trên bản sao)
        for (Point2D p : new ArrayList<>(points)) {
            points.add(p.symmetric());   // đa hình: tự gọi đúng symmetric() của 2D hoặc 3D
        }

        // Hiển thị danh sách các điểm
        System.out.println("\nDanh sach cac diem:");
        for (Point2D p : points) {
            System.out.println(p);
        }
    }
}