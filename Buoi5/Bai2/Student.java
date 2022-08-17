package Buoi5.Bai2;


import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private int age;
    Address address = new Address();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }


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

        System.out.printf("%-15d %-20s %-20d", id, name, age);
        address.xuat();
        System.out.printf("\n");
    }


}
