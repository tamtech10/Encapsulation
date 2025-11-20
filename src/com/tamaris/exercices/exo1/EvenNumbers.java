package com.tamaris.exercices.exo1;

public class EvenNumbers {

    void firstFive() {

        int nb = 0;
        int count = 0;

        while (true) {
            nb++;

            if (nb % 2 != 0) {
                continue;
            } count++;

            if (nb > 20) {
                break;
            }
            System.out.println("Our even number is: " + nb);

            if (count == 5) {
                break;
            }

            ;
        }

    }
}
