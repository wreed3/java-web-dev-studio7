package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc {
    public CD(int storageCapacity, String name, String discType) {
        super(storageCapacity, name, discType);
    }

    @Override
    public void readWavelength() {
        System.out.println("wavelength of 780 nm");

    }

    @Override
    public void writeData() {
        System.out.println("Read mechanism : 1200 Kib/s");

    }

    @Override
    public void spinDisc() {
        System.out.println("CD spinning at 400 rpm");
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
