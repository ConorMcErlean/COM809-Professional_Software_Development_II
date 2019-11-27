package Lab4_Test1;

/*
Created by Conor (mcerlean-c13@ulster.ac.uk) on 25/11/2019
stores information on geometric houses
*/
public class HouseShape {
   //Instance Variables
   private String colour;

   // Constructors
   public HouseShape(){
      colour = "Yellow"; //Default value
   }//Default constructor

   public HouseShape(String colour){
      this.colour = colour;
   }// Constructor 2

   //Methods

   public String toString(){
      return "This house colour is " + colour + ".";
   }

}//class
