package com.epam.rd.autotasks.sequence;

import java.util.Scanner;

public class FindMaxInSeq {
    public static int max() {
        // Put your code here
        Scanner input = new Scanner(System.in);

        int max = 0;

        while (true) {
            int number = input.nextInt();

            if (number == 0) {
                break;
            }

            for (int i = 1; i <= number; i++) {
                if (number > max) {
                    max = number;
                }
            }
        }

        return max;
    }
    public static void main(String[] args) {

        System.out.println("Test your code here!\n");
        // Get a result of your code
        System.out.println(max());
    }
}
