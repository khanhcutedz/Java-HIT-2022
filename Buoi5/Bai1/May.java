package Buoi5.Bai1;

import java.util.Scanner;

public class May {
    private int maMay;
    private String kieuMay;
    private String tinhTrang;

    Scanner sc =new Scanner(System.in);
    public void nhap(){
        System.out.println("Nhap ma may: "); maMay= sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap kieu may: "); kieuMay= sc.nextLine();
        System.out.println("Nhap tinh trang: "); tinhTrang= sc.nextLine();
    }
    public void xuat(){
        System.out.println("Ma may: " +maMay);
        System.out.println("Kieu may: " +kieuMay);
        System.out.println("Tinh trang: " +tinhTrang);
    }
}
