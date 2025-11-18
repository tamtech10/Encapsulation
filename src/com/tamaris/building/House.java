package com.tamaris.building;

import com.tamaris.library.Book;

public class House {

    public House() {

        //Public Method en attribute
        Book book = new Book();
        book.printBook();
        book.titre = "New Book";

        //Protected Method en attribute
        //ako su u razlicitom package, za rec protected ne mozemo da pozovemo ako nemamo heritage
        //book.author = "Frank";
        //book.modifyBook();// can not access to protected

        //Private Method an attribute
        //nije moguce jer je to kao sef od roditelja

        //Default Method an attribute
        //book.pages = 100; //nije moguce ni pozvato metodu ni objekat
        //book.countPages();
    }
}
