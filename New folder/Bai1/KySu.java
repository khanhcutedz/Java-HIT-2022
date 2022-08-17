package Buoi6.Bai1;

public class KySu extends CanBo{
    private String nganh;

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public KySu(String nganh) {
        super();
        this.nganh = nganh;
    }

    public KySu() {
    }

    @Override
    public void Nhap(){
        super.Nhap();
        System.out.println("Nhap nganh:"); nganh= sc.nextLine();
    }
    @Override
    public void Xuat(){
        super.Xuat();
        System.out.printf("%-10s",nganh);
    }
    @Override
    public String toString(){
        return super.toString()+ "Nganh: "+nganh;
    }

}
