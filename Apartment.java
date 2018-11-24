/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package housingapp;

/**
 *
 * @author x18100252
 */
public class Apartment extends Property{
    
    int floor;
    
    public Apartment(int xnoOfBeds, int xnoOfToilets, int floor){
        super(xnoOfBeds,xnoOfToilets);
        floor = 0;
    }
    
    public Apartment(){
        super();
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }
    
    
    
}
