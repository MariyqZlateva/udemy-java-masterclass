package com.zlateva;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(10, false);
        printer.printPages(30);
        System.out.println(printer.getPagesPrinted());
        printer.printPages(70);
        System.out.println(printer.getPagesPrinted());
        printer.addToner(100);
    }
}
