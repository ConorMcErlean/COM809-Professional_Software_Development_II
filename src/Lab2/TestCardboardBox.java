package Lab2;

// Imports
import java.util.Scanner;
/*
Created by Conor (mcerlean-c13@ulster.ac.uk) on 15/11/2019
Program to test the CardboardBox Class
*/
public class TestCardboardBox {
   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);

      //Declare variables
         //None needed

      //Create myBox and print out the details
      CardboardBox myBox = new CardboardBox();
      myBox.showAllDetails();

      //Create yourBox and print out the details
      // Width = 15  Height = 5  Depth = 25
      CardboardBox yourBox = new CardboardBox(15, 5,
            25);
      yourBox.showAllDetails();

      //Print outthe Top Area, Front Area and Side Area of yourBox
      yourBox.printTopArea();
      yourBox.printFrontArea();
      yourBox.printSideArea();

      //Create aBox and print out the details
      // Width = 20  Height = 15  Depth = 10  Colour = brown
      CardboardBox aBox = new CardboardBox(20,15,
            10,"brown");
      aBox.showAllDetails();
      //Print out the Top Area, Front Area and Side Area of aBox
      aBox.printTopArea();
      aBox.printFrontArea();
      aBox.printSideArea();

      //Prompt the user for the 4 attributes and assign these
      // using the appropriate set methods to myBox

      System.out.print("Please enter the height of the box: ");
      myBox.setHeight(keyboard.nextInt());
      System.out.print("Please enter the width of the box: ");
      myBox.setWidth(keyboard.nextInt());
      System.out.print("Please enter the depth of the box: ");
      myBox.setDepth(keyboard.nextInt());
      System.out.print("Please enter the colour of the box: ");
      myBox.setColour(keyboard.next());

      //Print out all the details of myBox
      myBox.showAllDetails();

      //Print out the number of boxes that have been created
      System.out.println("\nThe total number of created boxes is " +
            CardboardBox.numberOfBoxes());
   }//main
}//class
