import java.util.Scanner;
public class NhanVien {
    private static int temp=1;
    private int maNV;
    private String ten;
//    private int age;
//    private String khoa;
//    private String nganh;
    private int tuoi;
    private String diaChi;
    private String boPhan;
    Scanner sc= new Scanner(System.in);


//    public NhanVien(String tens, int tuois, String diaChis, String boPhans) {
//        maNV = temp++;
//        ten= tens;
//        tuoi= tuois;
//        diaChi= diaChis;
//        boPhan= boPhans;
//    }
    public NhanVien(){
        maNV= temp++;
    }
//    public NhanVien(int maNV, String ten, int tuoi, String diaChi, String boPhan) {
//        this.maNV = maNV;
//        this.ten = ten;
//        this.tuoi = tuoi;
//        this.diaChi = diaChi;
//        this.boPhan = boPhan;
//    }

    public void input(){

        System.out.println("Nhap ten: ");
        ten= sc.nextLine();
        System.out.println("Nhap tuoi: ");
        tuoi-=sc.nextInt();
        System.out.println("Nhap diachi: ");
        diaChi=sc.nextLine();
        System.out.println("Nhap bophan: ");
        boPhan=sc.nextLine();
    }
    public void ouput(){
        System.out.println("MaNV: "+maNV);
        System.out.println("Ten: "+ten);
        System.out.println("Tuoi: "+tuoi);
        System.out.println("DC: "+diaChi);
        System.out.println("BoPhan: "+boPhan);

    }
    //Sử dụng printf để in dưới dạng bảng
    public void output() {
        System.out.printf("%10d %10s %10d %15s %10s\n", maNV, ten, tuoi, diaChi, boPhan);
    }

    public static void main(String[] args) {
//        NhanVien student1 = new NhanVien("A", 20, "Ha Noi", "KTMT");
//        NhanVien student2 = new NhanVien("B", 21, "Phu Tho", "KHPM");
//        NhanVien student3 = new NhanVien("C", 25, "Tuyen Quang", "CNTT");
//        NhanVien student4 = new NhanVien("D", 22, "Bac Giang", "KHMT");
//        NhanVien student5 = new NhanVien("E", 27, "Thai Nguyen", "CNTT");
        NhanVien student6= new NhanVien();
        NhanVien student7= new NhanVien();
        NhanVien student8= new NhanVien();

        System.out.printf("%10s %10s %10s %15s %10s\n","MaNV", "Ten", "Tuoi", "Dia Chi", "BoPhan");
        student6.output();
        student7.output();
        student8.output();
        student8.output();

//        student4.output();
//        student5.output();
//        student5.output();

    }
}


