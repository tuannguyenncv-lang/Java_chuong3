public class Bai1 {
    public static void main(String[] args) {
        Point2D a = new Point2D(1, 2);
        Point2D b = new Point2D(4, 6);

        System.out.println("A = " + a + ", B = " + b);
        System.out.printf("Khoang cach A-B: %.4f%n", a.distance(b));
        System.out.println("Doi xung cua A qua goc toa do: " + a.symmetric());

        a.translate(2, -1);
        System.out.println("A sau khi tinh tien (2, -1): " + a);
    }
}