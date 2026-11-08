package Baitrenlop;

import java.util.Scanner;

public class Nguoi {
    protected String hoTen;
    protected int tuoi;

    public Nguoi() {
    }

    public Nguoi(String hoTen, int tuoi) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
    }

    public String getHoTen() { return hoTen; }
    public int getTuoi() { return tuoi; }

    // Nhập thông tin
    public void nhap(Scanner sc) {
        System.out.print("Ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("Tuoi: ");
        tuoi = Integer.parseInt(sc.nextLine().trim());
    }

    // Xuất thông tin
    public void xuat() {
        System.out.printf("Ho ten: %-20s Tuoi: %d", hoTen, tuoi);
    }
}