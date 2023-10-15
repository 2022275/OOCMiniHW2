/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**Create a sailboat
 * requirements are String make, String type, int numSails, int numPassengers
 * @author User
 */
public class Sailboat extends Vehicle implements Sailable, Drivable {

    public Sailboat(String make, String type, int numSails, int numPassengers) {
        this.make = make;
        this.type = type;
        this.numSails = numSails;
        this.numPassengers = numPassengers;
    }

    @Override
    public void hoistSail() {
    }

    @Override
    public void lowerSail() {
    }

    @Override
    public boolean isSailHoisted() {
        return false;
    }

    @Override
    public void landHo() {
    }

    @Override
    public void accelerate(float speed) {
        }

    @Override
    public void brake() {
    }

    @Override
    public void turn(float angle) {
    }

    @Override
    public float getDirection() {
        return 0;
    }

    @Override
    public float getSpeed() {
        return 0;
    }

    @Override
    public String getMake() {
        return make;
    }

    @Override
    public String getType() {
        return type;
    }

}
