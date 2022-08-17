package Buoi6.Bai2;

import java.util.Scanner;

public class Main {
    public static int n;
    public static PhuongTien a[];
    static Scanner sc = new Scanner(System.in);

    public static void Nhap(){
        System.out.print("Nhap so luong phuong tien: ");
        n = sc.nextInt();
        a = new PhuongTien[n];
        for (int i = 0; i < n; i++) {
            a[i] = new PhuongTien();
            System.out.println("Nhap thong tin phuong tien " + (i + 1));
            a[i].nhap();
        }
    }

    public static void Xuat(){
        System.out.println("Danh sach vua nhap:");
        System.out.printf("%-20s %-15s %-10s %-10s %-10s ","tenChuXe","loaiXe","dungTich","triGia", "Thue");
        System.out.println("");
        for(int i=0; i<n; i++){
            a[i].xuat();
        }
    }
    public static void XuatGiamDan(){
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i].Thue() < a[j].Thue()) {
                    PhuongTien temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for(int i=0; i<n; i++){
            a[i].xuat();
        }
    }
    public static void XuatTangDan(){
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i].Thue() > a[j].Thue()) {
                    PhuongTien temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for(int i=0; i<n; i++){
            a[i].xuat();
        }
    }

    public static void main(String[] args) {
        int luaChon;
        do {
            System.out.println("---------------------Menu--------------------");
            System.out.println("1.Nhập thông tin và tạo danh sách các xe");
            System.out.println("2.Xuất bảng kê khai tiền thuế trước bạ của các xe.");
            System.out.println("3.Xuất bảng kê khai tiền thuế trước bạ của các xe với tiền thuế giảm dần");
            System.out.println("4.Xuất bảng kê khai tiền thuế trước bạ của các xe với trị giá tăng dần");
            System.out.println("5.Thoát.");
            System.out.print("Moi ban nhap lua chon:");
            luaChon = sc.nextInt();
            switch (luaChon) {
                case 1:
                    Nhap();
                    break;
                case 2:
                    Xuat();
                    break;
                case 3:
                    XuatGiamDan();
                    break;
                case 4:
                    XuatTangDan();
                    break;
                case 5:
                    System.out.println("Thoat chuong trinh");
                    break;
                }
            } while (luaChon != 5);
    }
}
