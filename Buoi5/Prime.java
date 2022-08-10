package Buoi5;

import java.util.Scanner;

public class Prime {
    public static boolean isPrime(int n){
        if(n<2){
            return false;
        }else{
            for(int i=2; i<= Math.sqrt(n); i++){
                if(n% i ==0)
                    return false;
            }
            return true;
        }
    }
    public static boolean isPrime(long n){
        if(n<2){
            return false;
        }else{
            for(int i=2; i<= Math.sqrt(n); i++){
                if(n% i ==0)
                    return false;
            }
            return true;
        }
    }
    public static boolean isPrime(float n){

        if(n<2){
            return false;
        }else if(n != (int)n){
            return false;
        }
        else{
            for(int i=2; i<= Math.sqrt(n); i++){
                if(n% i ==0)
                    return false;
            }
            return true;
        }
    }
    public static boolean isPrime(double n){
        if(n<2){
            return false;
        }else if(n != (int)n){
            return false;
        }else{
            for(int i=2; i<= Math.sqrt(n); i++){
                if(n% i ==0)
                    return false;
            }
            return true;
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap n = ");
        int a = scanner.nextInt();
        if (isPrime(a))
            System.out.println(a + " la so nguyen to");
        else
            System.out.println(a + " khong la so nguyen to");

        System.out.println("Nhap n = ");
        long b = scanner.nextLong();
        if (isPrime(b))
            System.out.println(b + " la so nguyen to");
        else
            System.out.println(b + " khong la so nguyen to");

        System.out.println("Nhap n = ");
        float c = scanner.nextFloat();
        if (isPrime(c))
            System.out.println(c + " la so nguyen to");
        else
            System.out.println(c + " khong la so nguyen to");

        System.out.println("Nhap n = ");
        double d = scanner.nextDouble();
        if (isPrime(d))
            System.out.println(d + " la so nguyen to");
        else
            System.out.println(d + " khong la so nguyen to");
    }
}
