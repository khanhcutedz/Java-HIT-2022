package Buoi5.Bai3;

import java.util.Scanner;

public class Prime {
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0)
                    return false;
            }
            return true;
        }
    }

    public static boolean isPrime(long n) {
        if (n < 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0)
                    return false;
            }
            return true;
        }
    }

    public static boolean isPrime(float n) {
        return false;
    }

    public static boolean isPrime(double n) {
        return false;
    }
}

