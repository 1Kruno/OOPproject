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
public class Property extends HousingGUI implements Serializable{
   
    protected int noOfToilets;
    protected int noOfBeds;
    protected String Area;
    protected int price;

    
    public Property(){
        noOfBeds = 0;
        noOfToilets = 1;
        Area = "";
    }
    
    public Property(int noOfBeds, int noOfToilets, String Area){
        this.noOfBeds = noOfBeds;
        this.noOfToilets = noOfToilets;
        this.Area = Area;
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

    public String getArea() {
        return Area;
    }

    public void setArea(String Area) {
        this.Area = Area;
    }
    
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    
    
    public String printDetails()
    {
        return "Property search details"+","+noOfBeds+","+noOfToilets+",";
    }
   
    
}
