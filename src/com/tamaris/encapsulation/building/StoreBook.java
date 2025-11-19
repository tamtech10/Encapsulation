package com.tamaris.encapsulation.building;

import com.tamaris.encapsulation.library.Book;

public class StoreBook extends Book {

        public StoreBook() {
            //Public Method en attribute
            titre = "Store Book";
            printBook();

            //Protected Method en attribute
            author = "Frank";
            modifyBook();

            //Private Method an attribute
            //nije moguce jer je to kao sef od roditelja

            //Default Method an attribute
            //pages = 100;
            //countPages();
        }
}
