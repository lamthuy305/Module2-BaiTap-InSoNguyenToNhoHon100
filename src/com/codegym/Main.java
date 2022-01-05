package com.codegym;

public class Main {

    public static void main(String[] args) {
        int count = 0;
        for (int number = 0; number < 100; number++) {
            boolean check = true;
            if (number < 2) {
                check = false;
            } else if (number > 2) {
                int i = 2;
                while (i <= Math.sqrt(number)) {
                    if (number % i == 0) {
                        check = false;
                        break;
                    }
                    i++;
                }
            }
            if (check) {
                count++;
                System.out.println("Số nguyên tố thứ " + count + " là: " + number);
            }
        }
    }
}
