package com.arbre;

import javafx.print.Printer;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Leaf a = new Leaf("a");
        com.arbre.Printer printer = new com.arbre.Printer() {
            @Override
            public void print(String document) {
                System.out.println("( " + document + " )");
            }
        };
        a.print(printer);
    }
}
