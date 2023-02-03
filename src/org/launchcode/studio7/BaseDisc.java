package org.launchcode.studio7;

public abstract class BaseDisc {

    private int rpm;

    private String isSpinning;

    private double storeData;

    private String name;

    private String content;

    private String discType;



    public BaseDisc(int rpm, String isSpinning, double storeData, String name,String content, String discType) {
        this.rpm = rpm;
        this.isSpinning = isSpinning;
        this.storeData = storeData;
        this.name = name;
        this.content = content;
        this.discType = discType;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }

    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }

    public String isSpinning() {
        return isSpinning;
    }

        public void setSpinning(String spinning) {
        isSpinning = spinning;
    }

    public double getStoreData() {
        return storeData;
    }

    public void setStoreData(double storeData) {
        this.storeData = storeData;
    }

    public void reportData(){
  System.out.println("Information of " + this.name + " is a " + this.discType +" type and it is "
          +this.isSpinning + ".It has " + this.storeData + " GB. " + "It has " + this.rpm + " rpm and " + this.content + " content.");
    }
}
