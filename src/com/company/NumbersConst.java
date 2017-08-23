package com.company;

public class NumbersConst {

    private NumbersConst(){

    }

    public final static int COUNT_LINE = 7;

    private final static char[][] ZERO = {{' ', ' ', '*', '*', '*', ' ', ' '},
                                          {' ', '*', ' ', ' ', ' ', '*', ' '},
                                          {'*', ' ', ' ', ' ', ' ', ' ', '*'},
                                          {'*', ' ', ' ', ' ', ' ', ' ', '*'},
                                          {'*', ' ', ' ', ' ', ' ', ' ', '*'},
                                          {' ', '*', ' ', ' ', ' ', '*', ' '},
                                          {' ', ' ', '*', '*', '*', ' ', ' '}};

    private final static char[][] ONE = {{' ', ' ', ' ', '*', ' ', ' ', ' '},
                                         {' ', ' ', '*', '*', ' ', ' ', ' '},
                                         {' ', ' ', ' ', '*', ' ', ' ', ' '},
                                         {' ', ' ', ' ', '*', ' ', ' ', ' '},
                                         {' ', ' ', ' ', '*', ' ', ' ', ' '},
                                         {' ', ' ', ' ', '*', ' ', ' ', ' '},
                                         {' ', ' ', '*', '*', '*', ' ', ' '}};

    private final static char[][] TWO = {{' ', ' ', '*', '*', '*', ' ', ' '},
                                         {' ', '*', ' ', ' ', ' ', '*', ' '},
                                         {' ', ' ', ' ', ' ', ' ', '*', ' '},
                                         {' ', ' ', ' ', ' ', '*', ' ', ' '},
                                         {' ', ' ', ' ', '*', ' ', ' ', ' '},
                                         {' ', ' ', '*', ' ', ' ', ' ', ' '},
                                         {' ', '*', '*', '*', '*', '*', ' '}};

    private final static char[][] THREE = {{' ', ' ', '*', '*', '*', ' ', ' '},
                                           {' ', '*', ' ', ' ', ' ', '*', ' '},
                                           {' ', ' ', ' ', ' ', ' ', '*', ' '},
                                           {' ', ' ', ' ', ' ', '*', ' ', ' '},
                                           {' ', ' ', ' ', ' ', ' ', '*', ' '},
                                           {' ', '*', ' ', ' ', ' ', '*', ' '},
                                           {' ', ' ', '*', '*', '*', ' ', ' '}};

    private final static char[][] FOUR = {{' ', ' ', ' ', '*', ' ', ' ', ' '},
                                          {' ', ' ', '*', '*', ' ', ' ', ' '},
                                          {' ', '*', ' ', '*', ' ', ' ', ' '},
                                          {'*', ' ', ' ', '*', ' ', ' ', ' '},
                                          {'*', '*', '*', '*', '*', ' ', ' '},
                                          {' ', ' ', ' ', '*', ' ', ' ', ' '},
                                          {' ', ' ', ' ', '*', ' ', ' ', ' '}};

    private final static char[][] FIVE = {{' ', '*', '*', '*', '*', '*', ' '},
                                          {' ', '*', ' ', ' ', ' ', ' ', ' '},
                                          {' ', '*', ' ', ' ', ' ', ' ', ' '},
                                          {' ', '*', '*', '*', '*', ' ', ' '},
                                          {' ', ' ', ' ', ' ', ' ', '*', ' '},
                                          {' ', '*', ' ', ' ', ' ', '*', ' '},
                                          {' ', ' ', '*', '*', '*', ' ', ' '}};

    private final static char[][] SIX = {{' ', ' ', '*', '*', '*', ' ', ' '},
                                         {' ', '*', ' ', ' ', ' ', '*', ' '},
                                         {' ', '*', ' ', ' ', ' ', ' ', ' '},
                                         {' ', '*', '*', '*', '*', ' ', ' '},
                                         {' ', '*', ' ', ' ', ' ', '*', ' '},
                                         {' ', '*', ' ', ' ', ' ', '*', ' '},
                                         {' ', ' ', '*', '*', '*', ' ', ' '}};

    private final static char[][] SEVEN = {{' ', '*', '*', '*', '*', '*', ' '},
                                           {' ', ' ', ' ', ' ', ' ', '*', ' '},
                                           {' ', ' ', ' ', ' ', '*', ' ', ' '},
                                           {' ', ' ', ' ', '*', ' ', ' ', ' '},
                                           {' ', ' ', '*', ' ', ' ', ' ', ' '},
                                           {' ', '*', ' ', ' ', ' ', ' ', ' '},
                                           {' ', '*', ' ', ' ', ' ', ' ', ' '}};

    private final static char[][] EIGHT = {{' ', ' ', '*', '*', '*', ' ', ' '},
                                           {' ', '*', ' ', ' ', ' ', '*', ' '},
                                           {' ', '*', ' ', ' ', ' ', '*', ' '},
                                           {' ', ' ', '*', '*', '*', ' ', ' '},
                                           {' ', '*', ' ', ' ', ' ', '*', ' '},
                                           {' ', '*', ' ', ' ', ' ', '*', ' '},
                                           {' ', ' ', '*', '*', '*', ' ', ' '}};

    private final static char[][] NINE = {{' ', ' ', '*', '*', '*', ' ', ' '},
                                          {' ', '*', ' ', ' ', ' ', '*', ' '},
                                          {' ', '*', ' ', ' ', ' ', '*', ' '},
                                          {' ', ' ', '*', '*', '*', '*', ' '},
                                          {' ', ' ', ' ', ' ', ' ', '*', ' '},
                                          {' ', '*', ' ', ' ', ' ', '*', ' '},
                                          {' ', ' ', '*', '*', '*', ' ', ' '}};

    private static void printNumber(char[][] aNumberArray){
        for (int i = 0; i < aNumberArray.length; i++){
            for (int j = 0; j < aNumberArray[i].length; j++){
                System.out.print(aNumberArray[i][j]);
            }
            System.out.println();
        }
    }

    private static void printNumberLine(char[][] aNumberArray, int aNumberLine){
            for (int j = 0; j < aNumberArray[aNumberLine].length; j++){
                System.out.print(aNumberArray[aNumberLine][j]);
            }
    }

    private static char[][] getArrayByNumber(int aNumber){
        switch (aNumber){
            case 0:
                return ZERO;
            case 1:
                return ONE;
            case 2:
                return TWO;
            case 3:
                return THREE;
            case 4:
                return FOUR;
            case 5:
                return FIVE;
            case 6:
                return SIX;
            case 7:
                return SEVEN;
            case 8:
                return EIGHT;
            case 9:
                return NINE;
            default:
                return null;
        }
    }

    public static void printNumberLine(int aNumber, int aNumberLine){
        printNumberLine(getArrayByNumber(aNumber), aNumberLine);
    }
}
