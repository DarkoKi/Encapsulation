package com.company;

public class Printer {

    private int tonerLevel;
    private int numPagePrinted;
    private boolean duplexPrinter;

    public Printer(int tonerLevel, int numPagePrinted, boolean duplexPrinter) {
        this.tonerLevel = tonerLevel;
        this.numPagePrinted = numPagePrinted;
        this.duplexPrinter = duplexPrinter;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public void setTonerLevel(int tonerLevel) {
        this.tonerLevel = tonerLevel;
    }

    public int getNumPagePrinted() {
        return numPagePrinted;
    }

    public void setNumPagePrinted(int numPagePrinted) {
        this.numPagePrinted = numPagePrinted;
    }

    public boolean isDuplexPrinter() {
        return duplexPrinter;
    }

    public void setDuplexPrinter(boolean duplexPrinter) {
        this.duplexPrinter = duplexPrinter;
    }

    public void fillUp(int punjenje) {

        if (this.tonerLevel == 100) {
            System.out.println("Toner stampaca je pun!!!");
        } else if ((this.tonerLevel + punjenje) <= 100) {
            System.out.println("Toner stampaca je na nivou od " + (this.tonerLevel + punjenje) + " %!!!");
        }
        else{
            System.out.println("Toner stampaca je na nivou od " + this.tonerLevel + " %!!!");
        }
    }

    public void stampanjeStranica(int brStranica){
        int ukupanBrOdstampanihStranica = this.numPagePrinted + brStranica;
        System.out.println("Ukupan broj odstampanih stranica je : " + ukupanBrOdstampanihStranica);

    }

}
