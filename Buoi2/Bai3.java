package Buoi2;

import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int i,n;
		long S;
		do {
			System.out.println("Nhap n");
			n= sc.nextInt();
			if(n<=0) {
				System.out.println("Nhap lai n, n phai lon hon 0");
			}
		}while(n<=0);
		i=1;
		S=n;
		while(i<n) {
			if(n%i ==0) {
				S+= i;
			}
			i++;
		}
		System.out.println("Tong cac uoc cua n gom ca n la "+S);
		
		
	}	
}
