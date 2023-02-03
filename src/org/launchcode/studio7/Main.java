package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.

   CD myCd = new CD(500, "spinning", 0.7, "CD", "music", "CD-DA");
   DVD myDvd = new DVD(1600, "spinning", 4.7, "DVD", "movie", "DVD-R/RW");
   myCd.spinDisc();
   myCd.writeData();
   myCd.readData();

   myDvd.spinDisc();
   myDvd.writeData();
   myDvd.readData();


   myCd.reportData();
   myDvd.reportData();
    }
}
