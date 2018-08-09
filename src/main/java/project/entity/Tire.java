package project.entity;

import java.util.UUID;

public class Tire {

    private String tireID;

    private String frontLeft;
    private String frontRight;
    private String rearLeft;
    private String rearRight;

    public Tire(){
        this.tireID = UUID.randomUUID().toString();
    }

    public String getTireID() {
        return tireID;
    }

    public void setTireID(String tireID) {
        this.tireID = tireID;
    }

    public String getFrontLeft() {
        return frontLeft;
    }

    public void setFrontLeft(String frontLeft) {
        this.frontLeft = frontLeft;
    }

    public String getFrontRight() {
        return frontRight;
    }

    public void setFrontRight(String frontRight) {
        this.frontRight = frontRight;
    }

    public String getRearLeft() {
        return rearLeft;
    }

    public void setRearLeft(String rearLeft) {
        this.rearLeft = rearLeft;
    }

    public String getRearRight() {
        return rearRight;
    }

    public void setRearRight(String rearRight) {
        this.rearRight = rearRight;
    }

    @Override
    public String toString() {
        return "Tire{" +
                "tireID='" + tireID + '\'' +
                ", frontLeft='" + frontLeft + '\'' +
                ", frontRight='" + frontRight + '\'' +
                ", rearLeft='" + rearLeft + '\'' +
                ", rearRight='" + rearRight + '\'' +
                '}';
    }
}
