package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.

            CD cd = new CD(700, "Spider man", "CDROM");
            DVD dvd = new DVD(8000, "Iron man", "DVDROM");
            VinylRecords vinylRecords = new VinylRecords(40, "Captain Planet", "Vinyl Record");
            FloppyDisks floppyDisks = new FloppyDisks(150,"PAC MAN", "Floppy Disc");

            cd.spinDisc();
            dvd.spinDisc();
            cd.readWavelength();
            dvd.readWavelength();
            cd.writeData();
            dvd.writeData();
            vinylRecords.spinDisc();
            floppyDisks.spinDisc();


        // TODO: Call each CD and DVD method to verify that they work as expected.

    }
}
