package com.tamaris.encapsulation.library;

public class CourseBook extends Book{

    public CourseBook() {
        //Public Method en attribute
        titre = "Course Book";
        printBook();

        //Protected Method en attribute
        author = "Frank";
        modifyBook();

        //Private Method an attribute
        //nije moguce jer je to kao sef od roditelja

        //Default Method an attribute
        pages = 100;
        countPages();

    }
}
