package Lab4_Test1;

/*
Created by Conor (mcerlean-c13@ulster.ac.uk) on 25/11/2019
Stores details about square houses
*/
public class SquareHouse extends HouseShape {
   // Static Variables
   private static int numberOfSquareHouses = 0;

   // Instance Variables
   private int length, width;

   //Constructors
   public SquareHouse(String colour, int length, int width){
      super(colour);
      this.length = length;
      this.width = width;
      numberOfSquareHouses++;
   }// Constructor

   // Class Methods

   // Calculates area, private 'support' method
   private int area(){
      return length * width;
   }

   public String toString(){
      return super.toString() + " The area of this house is "
            + area() + " units sq.";
   }

   // Static Methods

   public static int numberOfSquareHouses(){
      return numberOfSquareHouses;
   }
}//class
