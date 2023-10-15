/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author User
 */
public class Car extends Vehicle implements Drivable {

    public Car(String make, String type, int numWheels, int numPassengers) {
        this.make = make;
        this.type = type;
        this.numWheels = numWheels;
        this.numPassengers = numPassengers;
    }
    
    
 @Override
    public void accelerate(float speed) {
        this.speed += speed;
    }

    @Override
    public void brake() {
        this.speed = 0;
    }

    @Override
    public void turn(float angle) {
        this.direction += angle;
    }

    @Override
    public float getDirection() {
        return direction;
    }

    @Override
    public float getSpeed() {
        return speed = 280;
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

