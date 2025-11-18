package com01;

import java.util.Arrays; // ctrl + levi klik misa

public class Alphabet {

    char[] letters;

    public Alphabet() {
        this.letters = new char[26];
        for (int i = 0; i < this.letters.length; i++) {  //i = a; i <= z; i++
            this.letters[i] = (char) ('a' + i);
        }
    }

    public void printAlphabet() {
        System.out.println(Arrays.toString(this.letters));
    }

    }

