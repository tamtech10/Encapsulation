package com03;

public class FormulePalidrome {

    public static boolean isPalidrome(int number) {

        int originaNumber = number;
        int reverseNumber = 0;

        while(number != 0) { //ili number > 0
            int lastDIgit = number % 10;
            reverseNumber = reverseNumber * 10 + lastDIgit; //lastDigit je modulo
            number = number / 10;


        }



        return  originaNumber == reverseNumber;
    }
}
