/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author sweiss
 */
public class OOCMiniHW2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Car myCar = new Car("BMW", "Saloon", 4, 5);
        Airplane myAirplane = new Airplane("Airbus","A340",2, 359);
        Sailboat mySailboat = new Sailboat("Suzuki", "Cruiser", 2, 10);
        
        
        System.out.println("The car was made by "+ myCar.getMake()+ " it's body type is " + myCar.getType() + " and goes up to the speed of " + myCar.getSpeed()+ " km/h."); 

        
        System.out.println("The Airplane was made by " + myAirplane.getMake()+ " it's body type is " + myAirplane.getType() + " and can fly carrying " + myAirplane.numPassengers + " passengers." ); 
        
        
        System.out.println("Finnaly the Sailboat is made by " + mySailboat.getMake()+ " it's powered by " + mySailboat.numSails + " sails and it's carrying " + mySailboat.numPassengers + " passengers."); 
       

        
    }
    
}
