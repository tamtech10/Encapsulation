package com.tamaris.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class Array {

    static <List> void main(String[] args) {

        //Arrays declaration - visedimenzione tabele

        //data type -> [] -> name;


        //Simple array declaration
        int[] numbers = new int[5]; // int number [] = new int[5]; mozemo i ovako da deklarisemo

        //Two- dimentional array declaration
        int[][] numbers2D = new int[3][4];

        //Three- dimentional array declaration
        int[][][] numbers3D = new int[1][2][3];

        // Array with Objects
        //String[] names = new String[3]; //prvo deklarisemo velicinu stringa
        String[] names = {"frank", "John", "Mary"}; // ili odmah upisemo velicinu

        // Add a new element to the array
        int[] nb = new int[5];
        nb[0] = 10;
        nb[1] = 20;
        nb[2] = 30;
        nb[3] = 40;
        nb[4] = 50;

        int[] newNb = Arrays.copyOf(nb, 10); //lepi novu tabelu umesto stare
        newNb[newNb.length - 1] = 60; //to radimo jer ne mozes da menjas prvobitnu

        // Convert a list on array
        // List to convert

        ArrayList<Integer> list = new ArrayList<>(); //ovde ne mozemo staviti primitivne za type donnes
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        //ArrayList converted to Object[] array: //OVDE JE KAO TABELA OBJEKAT ALI NE I POJEDINACNI ELEMENTI
        Object[] objArr = list.toArray(); // to je tabela gde cemo skladistiti elemente nase liste
        //list.toArray je metoda Arrays.copyOf
        System.out.println(Arrays.toString(objArr)); //nisu celi nego je objekat pa zato da bi ih razlozili na pojedinacne elemente
        //zato radimo casting


        //using casting before performing addition
        for(Object obj : objArr) {

            System.out.println((Integer) obj + 1); //ovde dobijamo pojedinacne elemente nase tabele
        }

        int randomValue = list.get(new Random().nextInt(list.size())); //za array ne koristimo length nego size

       //insert a Value between two indexes - za ovo koristimo Maven i spoljasnju biblioteku
        // jer Java nema metodu koja ubacuje element u postojeći niz
        //jer su nizovi u Javi fiksne dužine

        Integer[] arr = {1, 2, 3, 4, 5};


    }
}
