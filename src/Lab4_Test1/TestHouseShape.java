package Lab4_Test1;

/*
Created by Conor (mcerlean-c13@ulster.ac.uk)
Created under test conditions on 25/11/2019
Testing the HouseShape Class & the Square house class.
*/
public class TestHouseShape {
   public static void main(String[] args) {

      // Creating 3 instances, 2 of which are SquareHouse.
      HouseShape madeupStreet1 = new HouseShape();
      SquareHouse madeupStreet2 = new SquareHouse("Blue",
            30, 30);
      SquareHouse madeupStreet3 = new SquareHouse("White", 40,
            40);

      System.out.println(madeupStreet1); // Implicate toString()
      System.out.println(madeupStreet2.toString()); //Explicate toString()
      System.out.println(madeupStreet3);
      System.out.println("\nThe total number of square houses created is "
      + SquareHouse.numberOfSquareHouses() + ".");
   }//main
}//class
