package Buoi6.Bai2;

import java.util.Scanner;

public class PhuongTien {
    private String tenChuXe;
    private String loaiXe;
    private double dungTich;
    private double triGia;
    public static Scanner sc = new Scanner(System.in);

    public PhuongTien(String tenChuXe, String loaiXe, double dungTich, double triGia) {
        this.tenChuXe = tenChuXe;
        this.loaiXe = loaiXe;
        this.dungTich = dungTich;
        this.triGia = triGia;
    }
    public PhuongTien(){

    }

    public String getTenChuXe() {
        return tenChuXe;
    }

    public void setTenChuXe(String tenChuXe) {
        this.tenChuXe = tenChuXe;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    public double getDungTich() {
        return dungTich;
    }

    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }

    public double getTriGia() {
        return triGia;
    }

    public void setTriGia(int triGia) {
        this.triGia = triGia;
    }

    public static Scanner getSc() {
        return sc;
    }

    public static void setSc(Scanner sc) {
        PhuongTien.sc = sc;
    }
    public void nhap(){
        System.out.println("Nhap ten chu xe: ");tenChuXe=sc.nextLine();
        System.out.println("Nhap loai xe: ");loaiXe=sc.nextLine();
        System.out.println("Nhap dung tich: ");dungTich=sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap tri gia: ");triGia=sc.nextInt();
        sc.nextLine();

    }
    public double Thue(){

        if(dungTich<100){
            return 0.02f*triGia;
        }
        if(dungTich>200){
            return 0.1f*triGia;
        }else{
            return 0.06f*triGia;
        }

    }
    public void xuat(){
        System.out.printf("%-20s %-15s %-10.2f %-10.2f %-10.2f",tenChuXe,loaiXe,dungTich,triGia,Thue());
        System.out.println("");
    }

}
