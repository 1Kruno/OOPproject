/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package housingapp;

import java.io.Serializable;

/**
 *
 * @author x18100252
 */
public abstract class Property implements Serializable{
   
    protected int noOfToilets;
    protected int noOfBeds;
    
    public Property(){
        noOfBeds = 0;
        noOfToilets = 0;
    }
    
    public Property(int xnoOfBeds, int xnoOfToilets){
        this.noOfBeds = xnoOfBeds;
        this.noOfToilets = xnoOfToilets;
    }

    public int getNoOfBeds() {
        return noOfBeds;
    }

    public void setNoOfBeds(int noOfBeds) {
        this.noOfBeds = noOfBeds;
    }

    public int getNoOfToilets() {
        return noOfToilets;
    }

    public void setNoOfToilets(int noOfToilets) {
        this.noOfToilets = noOfToilets;
    }
    
    
    
}
