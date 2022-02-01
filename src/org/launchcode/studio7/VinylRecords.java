package org.launchcode.studio7;

public class VinylRecords extends BaseDisc implements OpticalDisc {

    public VinylRecords(int storageCapacity, String name, String discType) {
        super(storageCapacity, name, discType);
    }

    @Override
    public void spinDisc() {
        System.out.println("wavelength of 200 nm");

    }

    @Override
    public void readWavelength() {
        System.out.println("Read mechanism : 45 b/s");
    }

    @Override
    public void writeData() {
        System.out.println("Vinyl Record spinning at 50 rpm");
    }
}
