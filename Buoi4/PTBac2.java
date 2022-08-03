import java.util.Scanner;
import java.text.DecimalFormat;
public class PTBac2 {
    private int a;
    private int b;
    private int c;

    Scanner sc= new Scanner(System.in);
    public void nhap(){
        System.out.println("Nhap a: ");
        a= sc.nextInt();
        System.out.println("Nhap b: ");
        b= sc.nextInt();
        System.out.println("Nhap c: ");
        c= sc.nextInt();
    }
    public void xuat(){
        System.out.println(a +"x^2 + " +b+"x + "+c +" = 0");
    }
    public void TinhNghiem(){
        double d= b*b-4*a*c;
        double x,x1,x2;

        if(d<0){
            System.out.println("PT vo nghiem");
        }
        else if(d==0){
            x=  (-b/(2*a));
            double roundOff = Math.round(x*100)/100.00;
            System.out.println("X= "+roundOff);
        }
        else{
            x1= (-b-Math.sqrt(d))/(2*a);
            x2= (-b+Math.sqrt(d))/(2*a);
            double roundOff1 = Math.round(x1*100)/100.00;
            double roundOff2 = Math.round(x2*100)/100.00;
            System.out.println("X1 = "+roundOff1);
            System.out.println("X1 = "+roundOff2);
        }
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        PTBac2 A;
        A= new PTBac2();
        A.nhap();
        A.xuat();
        A.TinhNghiem();
    }
}
