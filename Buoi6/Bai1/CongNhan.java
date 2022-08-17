package Buoi6;

public class CongNhan extends CanBo{
    private String bac;

    public String getCongViec() {
        return bac;
    }

    public void setCongViec(String bac) {
        this.bac = bac;
    }

    public CongNhan(String bac) {
        super();
        this.bac = bac;
    }
    public  CongNhan(){

    }
    @Override
    public void Nhap(){
        super.Nhap();
        System.out.println("Nhap bac:"); bac= sc.nextLine();
    }
    @Override
    public void Xuat(){
        super.Xuat();
        System.out.printf("%-10s",bac);
    }
    @Override
    public String toString(){
        return super.toString()+ "Bac: "+bac;
    }
}
