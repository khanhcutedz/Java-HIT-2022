package Buoi6;

import java.util.Scanner;

public class CanBo {
    static Scanner sc = new Scanner(System.in);
    protected int id;
    protected String hoTen;
    protected int namSinh;
    protected String gioiTinh;
    protected String diaChi;

    public int getId() {
        return id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public CanBo(int id, String hoTen, int namSinh, String gioiTinh, String diaChi) {
        this.id = id;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }
    public CanBo(){

    }
    public void Nhap(){
        System.out.println("Nhap id:"); id= sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap ho ten:"); hoTen= sc.nextLine();
        System.out.println("Nhap nam sinh:"); namSinh= sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap gioi tinh:"); gioiTinh= sc.nextLine();
        System.out.println("Nhap dia chi:"); diaChi= sc.nextLine();
    }
    public void Xuat(){
        System.out.printf("%-10d %-15s %-10d %-15s %-10s",id, hoTen, namSinh, gioiTinh,diaChi);
    }
    public String toString(){
        return "id :"+id +"Ho ten: "+hoTen+"Nam sinh: "+namSinh+"Gioi tinh:"+gioiTinh+"Dia chi:"+diaChi;
    }
}
