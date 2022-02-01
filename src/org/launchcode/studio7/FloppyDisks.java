package org.launchcode.studio7;

public class FloppyDisks extends BaseDisc implements OpticalDisc {

    public FloppyDisks(int storageCapacity, String name, String discType) {
        super(storageCapacity, name, discType);
    }

    @Override
    public void spinDisc() {
        System.out.println("wavelength of 350 nm");

    }

    @Override
    public void readWavelength() {
        System.out.println("Read mechanism : 65 b/s");

    }

    @Override
    public void writeData() {
        System.out.println("Floppy Disc  spinning at 50 rpm");
    }
}
