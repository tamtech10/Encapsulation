package com.tamaris.exercices.exo2;

public class MultiplicationTable {

    public static void printTable() {

        for(int i = 1; i <= 10; i++) { //spoljasnja petlja

            for(int j = 1; j <= 10; j++) { //unutrasnja petlja
                System.out.print( j * i  );
            }
            System.out.println();
        }



    }


}
