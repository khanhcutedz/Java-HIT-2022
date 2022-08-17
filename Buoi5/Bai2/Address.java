package Buoi5.Bai2;

import java.util.Scanner;

public class Address {
    private int id;
    private String district;
    private String province;

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap id: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap huyen: ");
        district = sc.nextLine();
        System.out.println("Nhap tinh: ");
        province = sc.nextLine();
    }

    public void xuat() {
        System.out.printf("%-10d %-20s %-20s", id, district, province);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }
}
