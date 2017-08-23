package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int number;
	    int tmp;
	    int size = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        number = in.nextInt();
        tmp = number;
        while (tmp != 0) {
            tmp = tmp / 10;
            size++;
        }
        int[] array = new int[size];
        for (int i = array.length - 1; i >= 0; i--) {
            array[i] = number % 10;
            number = number / 10;
        }
        for (int i = 0; i < NumbersConst.COUNT_LINE; i++) {
            for (int k = 0; k < array.length; k++) {
                NumbersConst.printNumberLine(array[k], i);
            }
            System.out.println();
        }
    }
}
