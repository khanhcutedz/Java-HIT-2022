package Buoi5.Bai2;

import java.util.Scanner;

public class Main {
    public static int n;
    public static Student sv[];


    public static void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        n = sc.nextInt();
        sv= new Student[n];


        for (int i = 0; i < n; i++) {
            sv[i] = new Student();
        }
        System.out.println("------Nhap danh sach sv--------");
        for(int i=0; i<n; i++){
            System.out.println("Moi nhap thong tin cua sv thu " + (i + 1));
            sv[i].nhap();
        }

    }
    public static void Xuat() {
        System.out.println("------Danh sach sv vua nhap--------");

        for (int i = 0; i < n; i++) {
            sv[i].xuat();
        }
    }
    public static void TimKiem() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap id can tim kiem: ");
        int b = sc.nextInt();
        System.out.printf("%-15s %-20s %-20s %-10s %-20s %-20s", "id", "name", "age", "id", "district", "province \n");
        for (int i = 0; i < n; i++) {
            if (sv[i].getId() == b) {
                sv[i].xuat();
            }
        }
    }

    public static void Sua() {
        String s1 = "Thanh Hoa";
        for (int i = 0; i < n; i++) {
            if (sv[i].address.getProvince().equals(s1)) {
                sv[i].address.setProvince("Hai Phong");
            }
        }
        System.out.println("-----------Sau khi Sua------------");
        System.out.printf("%-15s %-20s %-20s %-10s %-20s %-20s", "id", "name", "age", "id", "district", "province \n");
        for (int i = 0; i < n; i++) {
            sv[i].xuat();
        }
    }

    public static void XoaSV() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap id can xoa ");
        int id = sc.nextInt();
        int pos= 0;
        for (int i = 0; i < n; i++) {
            if (sv[i].getId() == id) {
                pos=i;
            }
        }
        for(int i=pos; i<n-1; i++){
            sv[i]= sv[i+1];
        }
        n--;

        System.out.println("-----------Sau khi xoa------------");
        System.out.printf("%15s %20s %20s %10s %20s %20s", "id", "name", "age", "id", "district", "province \n");
        for (int i = 0; i < n; i++) {
            sv[i].xuat();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int luaChon;
        do {
            System.out.println("              Menu");
            System.out.println("1. Nhap mot mang n sinh vien.");
            System.out.println("2. Hien thi thong tin cac sinh vien ra man hinh.");
            System.out.println("3. Tim kiem sinh vien theo Id và hien thi ra man hinh.");
            System.out.println("4. Sua cac sinh vien co province la “Thanh Hoa” thanh “Hai Phong”");
            System.out.println("5. Xoa sinh vien theo Id.");
            System.out.println("6. Thoat chuong trinh.");
            System.out.println("Moi nhap lua chon cua ban: ");
            luaChon = sc.nextInt();
        switch (luaChon) {
                case 1:{
                    Nhap();
                    break;
                }
                case 2: {
                    Xuat();
                    break;
                }
                case 3: {
                    TimKiem();
                    break;
                }
                case 4: {
                    Sua();
                    break;
                }
                case 5: {
                    XoaSV();
                    break;
                }
            }
        } while (luaChon !=6);


    }
}
