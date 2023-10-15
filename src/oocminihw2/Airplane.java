/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author User
 */
public class Airplane extends Vehicle implements Flyable {
    private float altitude;

    public Airplane(String make, String type, int numWings, int numPassengers) {
        this.make = make;
        this.type = type;
        this.numWings = numWings;
        this.numPassengers = numPassengers;
    }
    
    @Override 
    public float getAltitude() {
        return altitude;
    }
    
    @Override 
    public float getSpeed() {
        return speed;
    }
    
    @Override 
    public float getDirection() {
        return direction;
    }
    
    @Override 
    public String getMake() {
        return make;
    }
    
    @Override 
    public String getType() {
        return type;
    }
    
    
    public int getNumWheels() {
        return numWheels;
    }
    
    
    public int getNumWings() {
        return numWings;
    }

    
    public int getNumSails() {
        return numSails;
    }

    
    public int getNumPassengers() {
        return numPassengers;
    }

    @Override
    public void changeAltitude(float change) {
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

    
}

