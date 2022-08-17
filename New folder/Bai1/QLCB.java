package Buoi6.Bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class QLCB {
    static ArrayList<CanBo> List = new ArrayList<CanBo>();
    static Scanner sc =new Scanner(System.in);


    public static void Them(){
        int n;
        System.out.println("Nhap so luong can bo: ");
        n=sc.nextInt();
        int i=0;
        while(i !=n){
            CanBo a =new CanBo();
            System.out.println("Nhap can bo thu "+ (i+1));
            a.Nhap();
            List.add(a);
            i++;
        }
    }
    public static void HienThi(){
        System.out.printf("%-10s %-15s %-10s %-15s %-10s","id", "hoTen", "namSinh", "gioiTinh","diaChi");
        System.out.println("");
        for(int i=0; i<List.size(); i++){
            List.get(i).Xuat();
            System.out.println("");
        }
    }

    public static void Xoa() {
        System.out.println("Nhap id can xoa: ");
        int id = sc.nextInt();
        for (int i = 0; i < List.size(); i++) {
            if(List.get(i).getId() ==id){
                List.remove(i);
            }
        }
        System.out.println("Sau khi xoa");
        HienThi();
    }
    public static void TimKiem(){
        System.out.println("Nhap id can tim");
        int id = sc.nextInt();
        System.out.println("Ket qua tim kiem");
        System.out.printf("%-10s %-15s %-10s %-15s %-10s","id", "hoTen", "namSinh", "gioiTinh","diaChi");
        for(int i=0; i<List.size();i++){
            if(List.get(i).getId() ==id){
                List.get(i).Xuat();
                System.out.println("");
            }
        }
        System.out.println("Ket qua tim kiem");
        HienThi();
    }
    public static void main(String[] args) {
        int luachon;
        do {
            Scanner sn = new Scanner(System.in);
            System.out.println("-------------Menu------------");
            System.out.println("1.Add 1 cán bộ vào List tương ứng. ");
            System.out.println("2.Hiển thị danh sách các cán bộ. ");
            System.out.println("3.Xóa 1 cán bộ theo id. ");
            System.out.println("4.Tìm kiếm 1 cán bộ theo id. ");
            System.out.println("5.Dừng chương trình. ");
            System.out.print("Moi ban nhap lua chon:");
            luachon = sn.nextInt();
            switch (luachon) {
                case 1:
                    Them();
                    break;
                case 2:
                    HienThi();
                    break;
                case 3:
                    Xoa();
                    break;
                case 4:
                    TimKiem();
                    break;
                case 5:
                    System.out.println("Thoat chuong trinh");
                    break;
            }
        } while (luachon != 5);
    }

}
