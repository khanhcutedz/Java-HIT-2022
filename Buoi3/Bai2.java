package Buoi3;

import java.util.Scanner;
public class Bai2 {

	 
	public static void main(String[] args) {
		System.out.println("Nhap ten :");
		Scanner sc = new Scanner(System.in);
		String ten;
		ten= sc.nextLine();
		String k= ten.trim();
		String p= XoaSo(k);
		
		char[] charArray = p.toCharArray();
	    boolean foundSpace = true;
	    for(int i = 0; i < charArray.length; i++) {
	      if(Character.isLetter(charArray[i])) {
	        if(foundSpace) {
	          charArray[i] = Character.toUpperCase(charArray[i]);
	          foundSpace = false;
	        }
	      }
	      else {
	        foundSpace = true;
	      }
	}
	    p = String.valueOf(charArray);
	    System.out.println("Ten sau khi sua :"+ XoaGiua(p));
}		
	public static String Xoa(String s, int pos) {
	      return s.substring(0, pos) + s.substring(pos + 1);
	   }
	public static String XoaGiua(String a) {
		String p= a;
		int length= a.length();
		for(int i=0; i<length; i++) {
			if(p.charAt(i) == ' '  && p.charAt(i -1) == ' ') {
				p= Xoa(p, i);
			    i--;
			length--;
			}
		}
		return p;
	}
	public static String XoaSo(String a) {
		String p= a;
		int length= a.length();
		for(int i=0; i<length; i++) {
			if(p.charAt(i) == '1'  || p.charAt(i) == '2'
					|| p.charAt(i) == '3'|| p.charAt(i) == '4'
					|| p.charAt(i) == '5'|| p.charAt(i) == '6'
					|| p.charAt(i) == '7'|| p.charAt(i) == '8'
					|| p.charAt(i) == '9')  {
				p= Xoa(p, i);
			    i--;
			length--;
			}
		}
		return p;
	}
}
