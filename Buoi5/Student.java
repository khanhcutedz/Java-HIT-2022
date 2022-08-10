package Buoi5;

import java.util.ArrayList;
import java.util.Scanner;


public class Student {

    private static int n;
    private static ArrayList<Student> students = new ArrayList<>();
    private int id;
    private String name;
    private int age;
    Address address = new Address();



    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap id: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap ten: ");
        name = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        age = sc.nextInt();
        sc.nextLine();
        address.nhap();
    }

    public void xuat() {

        System.out.printf("%15d %20s %20d", id, name, age);
        address.xuat();
        System.out.printf("\n");
    }

    public static void TimKiem(Student a[], int n) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap id can tim kiem: ");
        int b = sc.nextInt();
        System.out.printf("%15s %20s %20s %10s %20s %20s", "id", "name", "age", "id", "district", "province \n");
        for (int i = 0; i < n; i++) {
            if (a[i].id == b) {
                a[i].xuat();
            }
        }
    }

    public static void Sua(Student a[], int n) {
        String s1 = "Thanh Hoa";
        for (int i = 0; i < n; i++) {
            if (a[i].address.getProvince().equals(s1)) {
                a[i].address.setProvince("Hai Phong");
            }
        }
    }

    public static void XoaSV(Student a[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap id can xoa ");
        int id = sc.nextInt();
        int pos= 0;
        for (int i = 0; i < n; i++) {
            if (a[i].id == id) {
                pos=i;
            }
        }
        for(int i=pos; i<n-1; i++){
            a[i]= a[i+1];
        }
        n--;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        n = sc.nextInt();
        sc.nextLine();
        Student sv[] = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap sinh vien thu " + (i + 1));
            sv[i] = new Student();
            sv[i].nhap();
        }
        System.out.printf("%15s %20s %20s %10s %20s %20s", "id", "name", "age", "id", "district", "province ");
        System.out.printf("\n");
        for (int i = 0; i < n; i++) {
            sv[i].xuat();
        }
        TimKiem(sv,n);
        Sua(sv,n);
        System.out.println("---Sau khi Sua--- ");
        System.out.printf("%15s %20s %20s %10s %20s %20s", "id", "name", "age","id","district", "province " );
        System.out.printf("\n");
        for(int i=0; i<n; i++){
            sv[i].xuat();
        }

        XoaSV(sv);
        System.out.println("---Sau khi xoa--- ");
        System.out.printf("%15s %20s %20s %10s %20s %20s", "id", "name", "age", "id", "district", "province ");
        System.out.printf("\n");
        for (int i = 0; i < n; i++) {
            sv[i].xuat();
        }
    }
}


