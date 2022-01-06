package com.algorithm;

public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Prime Number between 0-1000 are : ");
        for (int i = 0; i <= 1000; i++) {//3
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num == 0 || num == 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

