package Baitrenlop;

import java.util.Scanner;

public class Nhanvien extends Nguoi {
    public static final double LCB = 1.5;          
    public static final double PHUCAP_MOI_NAM = 0.2; 

    private int snct;     // số năm công tác
    private double hsl;   // hệ số lương

    public Nhanvien() {
        super();
    }

    public Nhanvien(String hoTen, int tuoi, int snct, double hsl) {
        super(hoTen, tuoi);
        this.snct = snct;
        this.hsl = hsl;
    }

    public int getSnct() { return snct; }
    public double getHsl() { return hsl; }

    // Tính tiền lương = lcb * hsl + phucap, với phucap = 0.2 * snct (đơn vị: triệu)
    public double tinhLuong() {
        double phucap = PHUCAP_MOI_NAM * snct;
        return LCB * hsl + phucap;
    }

    @Override
    public void nhap(Scanner sc) {
        super.nhap(sc);
        System.out.print("So nam cong tac: ");
        snct = Integer.parseInt(sc.nextLine().trim());
        System.out.print("He so luong: ");
        hsl = Double.parseDouble(sc.nextLine().trim());
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.printf("  SNCT: %-3d HSL: %-5.2f Luong: %.2f trieu%n", snct, hsl, tinhLuong());
    }
}