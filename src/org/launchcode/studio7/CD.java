package org.launchcode.studio7;

public class CD extends  BaseDisc implements  OpticalDisc{


    public CD(int rpm, String isSpinning, double storeData, String name, String content, String discType) {
        super(rpm, isSpinning, storeData, name, content, discType);
    }

    @Override
    public void spinDisc() {
        System.out.println("CD spins at a rate of 200-500 rpm.");
    }

    @Override
    public void writeData() {
     System.out.println("CD uses laser to read contents.");
    }

    @Override
    public void readData() {
        System.out.println("CD uses laser to read contents.");

    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
