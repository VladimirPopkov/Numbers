package com.company;

import java.util.Scanner;

public class Main {

    private final static char[][] number1 = {{' ', ' ', ' '},
                                             {}};

    public static void main(String[] args) {
	    int number;
	    int tmp;
	    char[][] array = new char[7][7];
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        number = in.nextInt();
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = ' ';
            }
        }
        /*while (number != 0){

        }*/
        switch (number){
            case 0:
                array[0][2] = '*';
                array[0][3] = '*';
                array[0][4] = '*';
                array[1][1] = '*';
                array[1][5] = '*';
                array[2][0] = '*';
                array[2][6] = '*';
                array[3][0] = '*';
                array[3][6] = '*';
                array[4][0] = '*';
                array[4][6] = '*';
                array[5][1] = '*';
                array[5][5] = '*';
                array[6][2] = '*';
                array[6][3] = '*';
                array[6][4] = '*';
                break;
            case 1:
                array[0][3] = '*';
                array[1][2] = '*';
                array[1][3] = '*';
                array[2][3] = '*';
                array[3][3] = '*';
                array[4][3] = '*';
                array[5][3] = '*';
                array[6][2] = '*';
                array[6][3] = '*';
                array[6][4] = '*';
                break;
            case 2:
                array[0][2] = '*';
                array[0][3] = '*';
                array[0][4] = '*';
                array[1][1] = '*';
                array[1][5] = '*';
                array[2][4] = '*';
                array[3][3] = '*';
                array[4][2] = '*';
                array[5][1] = '*';
                array[6][1] = '*';
                array[6][2] = '*';
                array[6][3] = '*';
                array[6][4] = '*';
                array[6][5] = '*';
                break;
            case 3:
                array[0][2] = '*';
                array[0][3] = '*';
                array[0][4] = '*';
                array[1][1] = '*';
                array[1][5] = '*';
                array[2][5] = '*';
                array[3][4] = '*';
                array[3][3] = '*';
                array[4][5] = '*';
                array[5][5] = '*';
                array[5][1] = '*';
                array[6][4] = '*';
                array[6][3] = '*';
                array[6][2] = '*';
                break;
        }
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
