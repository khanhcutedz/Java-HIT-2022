package Buoi6;

public class NhanVien extends CanBo{
    private String congViec;

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

    public NhanVien(String congViec) {
        super();
        this.congViec = congViec;
    }
    public  NhanVien(){

    }
    @Override
    public void Nhap(){
        super.Nhap();
        System.out.println("Nhap cong viec:"); congViec= sc.nextLine();
    }
    @Override
    public void Xuat(){
        super.Xuat();
        System.out.printf("%-10s",congViec);
    }
    @Override
    public String toString(){
        return super.toString()+ "Cong viec: "+congViec;
    }
}
