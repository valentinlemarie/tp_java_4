package com.arbre;

public class Leaf {

     private String txt;

    public  Leaf(String a){
        this.txt = a ;
    }

    public void print(Printer printer){
        printer.print(this.txt);
    }
}
