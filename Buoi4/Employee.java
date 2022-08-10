
import java.util.Scanner;
public class Employee {
    private String id;
    private String name;
    private int age;
    private int workingDay;
    private double salary;
    private static int PRICE= 50;
    Scanner sc = new Scanner(System.in);

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWorkingDay() {
        return workingDay;
    }

    public void setWorkingDay(int workingDay) {
        this.workingDay = workingDay;
    }

    public double salary(){
        return workingDay*PRICE;
    }

    public void input(){
        System.out.println("Nhap id: ");
        id= sc.nextLine();
        System.out.println("Nhap name: ");
        name=sc.nextLine();
        System.out.println("Nhap age: ");
        age=sc.nextInt();
        System.out.println("Nhap workingDay: ");
        workingDay=sc.nextInt();
    }
    public void output(){
        System.out.println("Id: "+ id);
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("WorkingDay: "+ workingDay);
        System.out.println("Salary: "+ salary());

    }
    public static void main(String[] args){
        Employee A= new Employee();

    }
    //    private String id;
//    private String name;
//    private int age;
//    private int workingDays;
//    private static int PRICE = 50;
//    Scanner sc = new Scanner(System.in);
//
//    public String getId() {
//        return id;
//    }
//    public String getName() {
//        return name;
//    }
//    public int getAge() {
//        return age;
//    }
//    public int getWorkingDays() {
//        return workingDays;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//    public void setName(String name) {
//        this.name = name;
//    }
//    public void setAge(int age) {
//        this.age = age;
//    }
//    public void setWorkingDays(int workingDays) {
//        this.workingDays = workingDays;
//    }
//    public Employee() {
//        id="";
//        name="";
//        age=0;
//        workingDays=0;
//    }
//    public Employee(String id, String name, int age, int workingDays) {
//        this.id = id;
//        this.name = name;
//        this.age = age;
//        this.workingDays = workingDays;
//    }
//    public double salary(){
//        double salary = workingDays * PRICE;
//        return salary;
//    }
//    public void nhap(){
//        System.out.println("Nhap ma nhan vien: ");
//        id = sc.nextLine();
//        System.out.println("Nhap ten: ");
//        name = sc.nextLine();
//        System.out.println("Nhap tuoi: ");
//        age = sc.nextInt();
//        System.out.println("Nhap so ngay cong: ");
//        workingDays = sc.nextInt();
//    }
//    public void xuat(){
//        System.out.println("Ma nhan vien: " +id);
//        System.out.println("Ho ten: " + name);
//        System.out.println("Tuoi: " + age);
//        System.out.println("So ngay cong: " + workingDays);
//        System.out.println("Tien thuong: " + salary());
//    }
//    public static void main(String[] args) {
//        Employee A = new Employee();
//        A.nhap();
//        System.out.println("Employee A : ");
//        A.xuat();
//        Employee B = new Employee("5566", "Khanhcute", 21,24);
//        System.out.println("Employee B : ");
//        B.xuat();
//    }




}


