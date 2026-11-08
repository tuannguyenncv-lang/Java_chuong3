public class Bai2 {
    public static void main(String[] args) {
        Point3D a = new Point3D(1, 2, 3);
        Point3D b = new Point3D(4, 6, 8);

        System.out.println("A = " + a + ", B = " + b);
        System.out.printf("Khoang cach A-B: %.4f%n", a.distance(b));
        System.out.println("Doi xung cua A qua goc toa do: " + a.symmetric());

        a.translate(1, 1, -2);
        System.out.println("A sau khi tinh tien (1, 1, -2): " + a);
    }
}