package com.company;

public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer(60, 500, true);

        System.out.println("Pocetni parametri stampaca su : " + printer.getTonerLevel() + " " + printer.getNumPagePrinted() + " " + printer.isDuplexPrinter());

        int punjenjeTonera = 30;
        printer.fillUp(punjenjeTonera);

        int stampanjeStranica = 100;
        printer.stampanjeStranica(stampanjeStranica);
    }
}
