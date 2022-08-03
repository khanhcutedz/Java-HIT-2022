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



    public NhanVien(String tens, int tuois, String diaChis, String boPhans) {
        maNV = temp++;
        ten= tens;
        tuoi= tuois;
        diaChi= diaChis;
        boPhan= boPhans;
    }

    //Sử dụng printf để in dưới dạng bảng
    public void output() {
        System.out.printf("%10d %10s %10d %15s %10s\n", maNV, ten, tuoi, diaChi, boPhan);
    }

    public static void main(String[] args) {
        NhanVien student1 = new NhanVien("A", 20, "Ha Noi", "KTMT");
        NhanVien student2 = new NhanVien("B", 21, "Phu Tho", "KHPM");
        NhanVien student3 = new NhanVien("C", 25, "Tuyen Quang", "CNTT");
        NhanVien student4 = new NhanVien("D", 22, "Bac Giang", "KHMT");
        NhanVien student5 = new NhanVien("E", 27, "Thai Nguyen", "CNTT");
        System.out.printf("%10s %10s %10s %15s %10s\n","MaNV", "Ten", "Tuoi", "Dia Chi", "BoPhan");
        student1.output();
        student2.output();
        student3.output();
        student4.output();
        student5.output();

    }
}


//    public NhanVien(int msvs, int ages, String khoas, String nganhs) {
//        msv = msvs;
//        age = ages;
//        khoa = khoas;
//        nganh = nganhs;
//    }
//
//    //Sử dụng printf để in dưới dạng bảng
//    public void output() {
//        System.out.printf("%10d %10d %10s %10s\n", msv, age, khoa, nganh);
//    }
//
//    public static void main(String[] args) {
//        NhanVien student1 = new NhanVien(1, 20, "CNTT", "KTMT");
//        NhanVien student2 = new NhanVien(2, 21, "CNTT", "KHPM");
//        System.out.printf("%10s %10s %10s %10s\n", "Masv", "Tuoi", "Khoa", "Nganh");
//        student1.output();
//        student2.output();
//    }