package Buoi3;

import java.util.Scanner;
public class Bai1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhap n = ");
		int n;
		n= sc.nextInt();
		int a[]= new int [n];
		for(int i=0;i<n;i++) {
			a[i]= sc.nextInt();
		}
		System.out.printf("TBC = ");
		System.out.println((double) Math.round(TBC(a,n)*100)/100);
		System.out.println("Nhung vi tri min la:");
		TimMin(a,n);
		SoCP(a,n);
		Snt(a,n);
		SX(a,n);
	}
	public static double TBC(int a[], int n) {
		double sum =0;
		int dem =0;
		for(int i=0; i<n; i++) {
			if(a[i] %2!=0 && (i+1)%2 ==0 ) 
				dem++;
				sum+=a[i];
		}
		if(dem ==0)
			return 0;
		else
			return sum/dem;
	}
	public static int Min(int a[], int n) {
		int min=a[0];
		for(int i=1; i<n; i++) {
			if(a[i]<min) 
				min =a[i];
		}
		return min;
	}
	public static void TimMin(int a[], int n) {
		for(int i=0; i<n; i++)
		{
			if(a[i]== Min(a,n)) 
				System.out.printf(" "+ (i+1));
		}
	}
	public static void SoCP(int a[], int n) {
		System.out.println("\nSo chinh phuong trong mang ");
		double x, y;
		for(int i=0; i<n; i++) {
			x= Math.sqrt(a[i]);
			y=(int)x;
			if(x==y)
				System.out.printf(" "+a[i]);
		}
	}
	public static boolean KTSnt(int n) {
		for(int i=2; i<=Math.sqrt(n); i++) {
			if(n% i ==0)
				return false;
		}
		return n>1;
	}
	public static void Snt(int a[], int n) {
		System.out.println("\nSo nguyen to trong mang ");
		for(int i=0; i<n; i++) {
			if(KTSnt(a[i])== true)
				System.out.printf(" "+a[i]);
		}
	}
	public static void SX(int a[],int n) {
		System.out.println("\nSau khi sap xep ");
		for(int i=0; i<n-1; i++) {
			for(int j=i+1; j<n; j++) 
				if(a[j]< a[i])
				{
					int temp =a[i];
					a[i]= a[j];
					a[j]=temp;				
				}
		}
		for(int i=0; i<n; i++) {
			System.out.printf(" " +a[i]);
		}
	}
	
}
