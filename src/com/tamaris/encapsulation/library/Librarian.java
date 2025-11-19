package com.tamaris.encapsulation.library;

public class Librarian {

    public Librarian() {

        //Public Method en attribute
        Book book = new Book();
        book.printBook();
        book.titre = "New Book";

        //Protected Method en attribute (ako nemamo com.tamaris.heritage onda moramo da pozovemo objekat)
        book.author = "Frank";
        book.modifyBook();

        //Private Method an attribute
        //nije moguce jer je to kao sef od roditelja

        //Default Method an attribute
        book.pages = 100; //ovde pozivamo obj jer nemamo ext
        book.countPages();
    }
}
