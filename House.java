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
public class House extends Property{
    
    
    public House(){
        super();
    }
    
    public House(String Area, int noOfBeds, int noOfToilets){
        super(noOfBeds, noOfToilets, Area);
        this.Area = Area;
    }

  
    @Override
    public String printDetails()
    {
        return "Property search details"+","+noOfBeds+","+noOfToilets+","+Area;
    }
    
    
}
