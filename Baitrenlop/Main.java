package Baitrenlop;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so nhan vien n: ");
        int n = Integer.parseInt(sc.nextLine().trim());

        List<Nhanvien> ds = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            System.out.println("--- Nhan vien thu " + i + " ---");
            Nhanvien nv = new Nhanvien();
            nv.nhap(sc);
            ds.add(nv);
        }

        if (ds.isEmpty()) {
            System.out.println("Danh sach rong.");
            return;
        }

        int maxSnct = ds.get(0).getSnct();
        for (Nhanvien nv : ds) {
            if (nv.getSnct() > maxSnct) maxSnct = nv.getSnct();
        }
        System.out.println("\nNhan vien co so nam cong tac nhieu nhat (" + maxSnct + " nam):");
        for (Nhanvien nv : ds) {
            if (nv.getSnct() == maxSnct) nv.xuat();   // in hết nếu có nhiều người bằng nhau
        }

        ds.sort(Comparator.comparingDouble(Nhanvien::tinhLuong).reversed());
        System.out.println("\nDanh sach nhan vien theo luong giam dan:");
        for (Nhanvien nv : ds) {
            nv.xuat();
        }

        sc.close();
    }
}