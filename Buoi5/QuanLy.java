package Buoi5;
import java.util.Scanner;
public class QuanLy {
    private int maQL;
    private String hoTen;
        Scanner sc= new Scanner(System.in);
    public void nhap(){
        System.out.println("Nhap ma QL: "); maQL= sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap ho ten: "); hoTen= sc.nextLine();
    }
    public void xuat(){
        System.out.println("Ma QL: " +maQL);
        System.out.println("Ho ten: " +hoTen);
    }
}
