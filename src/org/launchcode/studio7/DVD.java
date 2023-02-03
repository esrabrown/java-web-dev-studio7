package org.launchcode.studio7;

import java.awt.*;

public class DVD extends BaseDisc implements OpticalDisc{


    public DVD(int rpm, String isSpinning, double storeData, String name, String content, String discType) {
        super(rpm, isSpinning, storeData, name, content, discType);
    }

    @Override
    public void spinDisc() {
     System.out.println("DVD spins at a rate of 570 - 1600 rpm.");
    }

    @Override
    public void writeData() {
      System.out.println("DVD uses laser to read contents.");
    }

    @Override
    public void readData() {
        System.out.println("DVD uses laser to read contents.");
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
