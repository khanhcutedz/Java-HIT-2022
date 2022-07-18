package Buoi2;

import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int day;
		int month;
		do
	    {
			System.out.println("Nhap ngay");
			day= sc.nextInt();
	        if(day < 0 || day > 31)
	        {
	        	System.out.println("Ngay sinh khong duoc qua 31. Vui long nhap lai"); 
	        }
	    }while (day < 0 || day > 31);
		
		do
	    {
			System.out.println("Nhap thang");
			month= sc.nextInt();
	        if(month < 0 || month  > 31)
	        {
	        	System.out.println("Thang sinh khong duoc qua 12. Vui long nhap lai"); 
	        }
	    }while (month < 0 || month > 12);
		
		if((day >= 21 && month == 3) || (day <= 19 && month == 4)) {
			System.out.println("Ngay " +day + " thang " +month +" thuoc cung Bach Duong"); 
		}
		
		else if((day >= 20 && month == 4) || (day <= 20 && month == 5)) {
			System.out.println("Ngay " +day + " thang " +month +" thuoc cung Kim Nguu"); 
		}
		
		else if((day >= 21 && month == 5) || (day <= 21 && month == 6)) {
			System.out.println("Ngay " +day + " thang " +month +" thuoc cung Song Tu"); 
		}
		else if((day >= 22 && month == 6) || (day <= 22 && month == 7)) {
			System.out.println("Ngay " +day + " thang " +month +" thuoc cung Cu Giai"); 
		}
		else if((day >= 23 && month == 7) || (day <= 22 && month == 8)) {
			System.out.println("Ngay " +day + " thang " +month +" thuoc cung Su Tu"); 
		}
		else if((day >= 23 && month == 8) || (day <= 22 && month == 9)) {
			System.out.println("Ngay " +day + " thang " +month +" thuoc cung Xu Nu"); 
		}
		else if((day >= 23 && month == 9) || (day <= 23 && month == 10)) {
			System.out.println("Ngay " +day + " thang " +month +" thuoc cung Thien Binh"); 
		}
		else if((day >= 24 && month == 10) || (day <= 21 && month == 11)) {
			System.out.println("Ngay " +day + " thang " +month +" thuoc cung Bo Cap"); 
		}
		else if((day >= 22 && month == 11) || (day <= 21 && month == 12)) {
			System.out.println("Ngay " +day + " thang " +month +" thuoc cung Nhan Ma"); 
		}
		else if((day >= 22 && month == 12) || (day <= 19 && month == 1)) {
			System.out.println("Ngay " +day + " thang " +month +" thuoc cung Ma Ket"); 
		}
		else if((day >= 20 && month == 1) || (day <= 18 && month == 2)) {
			System.out.println("Ngay " +day + " thang " +month +" thuoc cung Bao Binh"); 
		}
		else {
			System.out.println("Ngay " +day + " thang " +month +" thuoc cung Song Ngu");
		}
	}
}
