package Buoi2;

import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a,b,c;
		System.out.println("Nhap a");
		a= sc.nextInt();
		System.out.println("Nhap b");
		b= sc.nextInt();
		System.out.println("Nhap c");
		c= sc.nextInt();
		
		if(a+b>c || a+c >b || b+c >a) {
			if(a ==b && b== c) {
				System.out.println("Day la tam giac deu");
			}
			else if((a ==b || a==c || b==c) &&(a*a+ b*b == c*c || a*a + c*c== b*b || b*b +c*c ==a*a)) {
				System.out.println("Day la tam giac vuong can");
			}
			else if(a ==b || a==c || b==c) {
				System.out.println("Day la tam giac can");
			}
			else if(a*a+ b*b == c*c || a*a + c*c== b*b || b*b +c*c ==a*a) {
				System.out.println("Day la tam giac vuong");
			}
			else{
				System.out.println("Day la tam giac thuong");
			}
		}
		else {
			System.out.println("Day la khong phai 3 canh cua tam giac");
		}
	}
}
