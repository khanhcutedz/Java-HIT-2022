import java.util.Scanner;
public class HinhChuNhat {
    private double chieuDai;
    private double chieuRong;

    Scanner sc= new Scanner(System.in);
    public void nhap(){
        System.out.println("Nhap chieu dai A: " );
        chieuDai= sc.nextInt();
        System.out.println("Nhap chieu rong A: " );
        chieuRong= sc.nextInt();
    }
    public void xuat(){
        System.out.println("Dai A:" +chieuDai);
        System.out.println("Rong A:" +chieuRong);
    }

    public double TinhDienTich(){
        return chieuDai*chieuRong;
    }
    public double TinhChuVi(){
        return (chieuRong+chieuDai)*2;
    }

    public double getChieuDai(){
        return chieuDai;
    }
    public void setChieuDai(double chieuDai){
        this.chieuDai=chieuDai;
    }
    public double getChieuRong(){
        return chieuRong;
    }
    public void setChieuRong(double chieuRong){
        this.chieuRong=chieuRong;
    }

    public static void main(String [] args){
        HinhChuNhat A = new HinhChuNhat();
        HinhChuNhat B = new HinhChuNhat();
        A.nhap();
        Scanner sc= new Scanner(System.in);

        System.out.println("Nhap chieu dai B: ");
        B.setChieuDai(sc.nextDouble());
        System.out.println("Nhap chieu rong B: ");
        B.setChieuRong(sc.nextDouble());
        A.xuat();
        System.out.println("Dai B:"+ B.getChieuDai());
        System.out.println("Rong B:"+ B.getChieuRong());

        System.out.println("SA = "+ A.TinhDienTich());
        System.out.println("CA = "+ A.TinhChuVi());

        System.out.println("SB = "+ B.TinhDienTich());
        System.out.println("CB = "+ B.TinhChuVi());


        if(A.TinhDienTich() > B.TinhDienTich()){
            System.out.println("SA lon hon SB");
        }else System.out.println("SB lon hon SA");

    }
}
