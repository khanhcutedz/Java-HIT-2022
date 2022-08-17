package Buoi5.Bai1;

import java.util.Scanner;

public class PhongMay {
    private int maPhong;
    private String tenPhong;
    private double dienTich;
    private May may;
    private QuanLy quanLy= new QuanLy();
    Scanner sc= new Scanner(System.in);
    public void nhap(){
        System.out.println("Nhap ma phong: ");
        maPhong= sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap ten phong: ");
        tenPhong= sc.nextLine();
        System.out.println("Nhap dien tich: ");
        dienTich= sc.nextDouble();
        may= new May();
        may.nhap();
        quanLy.nhap();
    }
    public void xuat(){
        System.out.println("Ma phong: " +maPhong);
        System.out.println("Ten phong: " +tenPhong);
        System.out.println("Dien tich: " +dienTich);
        may.xuat();
        quanLy.xuat();
    }

}
