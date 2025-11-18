package com.tamaris.library;

public class Book {

    //Atributes

    //Public
    public String titre;

    protected String author;

    private String isbn;//jedinstveni kod svake knjige (id)

    int pages;

    public Book(){
        deliteBook(); //samo ovde mozemo pristupiti nasoj private metodi
    }

    //Methods

    public void printBook() {
        System.out.println("Printing a book...");
        deliteBook(); // ovako mozemo pristupiti private maetodi iz drugih prizira
    }

    protected void modifyBook() {
        System.out.println("Modifying a book...");
    }

    private void deliteBook() {
        System.out.println("Deleting a book...");
    }

    void countPages() { //default
        System.out.println("Counting pages...");
    }
}
