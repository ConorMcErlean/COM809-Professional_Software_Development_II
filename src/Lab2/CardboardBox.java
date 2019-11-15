package Lab2;

/*
Created by Conor (mcerlean-c13@ulster.ac.uk) on 15/11/2019
Class containing information on cardboard boxes, accessor & mutator methods,
a static variable, overloaded constructors and class methods.
*/
public class CardboardBox {
   // Object Variables
   private int width, height, depth;
   private String colour;
   private static int numberOfBoxes = 0;

   // Default Constructor
   public CardboardBox(){
      numberOfBoxes++;
   }//Default Constructor

   // Overloading Constructors:
   public CardboardBox(int boxWidth, int boxHeight, int boxDepth,
                       String boxColour){
      numberOfBoxes++;
      width = boxWidth;
      height = boxHeight;
      depth = boxDepth;
      colour = boxColour;
   } // CarboardBox

   public CardboardBox(int boxWidth, int boxHeight, int boxDepth){
      numberOfBoxes++;
      width = boxWidth;
      height = boxHeight;
      depth = boxDepth;
      colour = "unknown"; //Default Value
   }

   // Getter & Setter Methods.

   public int getWidth() {
      return width;
   }

   public void setWidth(int width) {
      this.width = width;
   }

   public int getHeight() {
      return height;
   }

   public void setHeight(int height) {
      this.height = height;
   }

   public int getDepth() {
      return depth;
   }

   public void setDepth(int depth) {
      this.depth = depth;
   }

   public String getColour() {
      return colour;
   }

   public void setColour(String colour) {
      this.colour = colour;
   }

   // Private method to return volume of cardboard box.
   private int volume(){
      return width * height * depth;
   }//Volume

   // Method to print all info about the cardboard box.
   public void showAllDetails(){
      System.out.println("The width of the cardboard box is " + width +
            " units.");
      System.out.println("The height of the cardboard box is " + height +
            " units.");
      System.out.println("The depth of the cardboard box is " + depth +
            " units.");
      System.out.println("The colour of the cardboard box is " + colour +
            ".");
      System.out.println("The volume of the cardboard box is " + volume() +
            " units cubed.");
   }//ShowAllDetails

   // Methods to print area of each side.
   public void printTopArea(){
      // Method to print to width * depth
      System.out.println("The top area is " + (width*depth)
            + " units squared.");
   }//printTopArea

   public void printFrontArea(){
      // Method to print to width * height
      System.out.println("The front area is " + (width*height)
            + " units squared.");
   }//printFrontArea

   public void printSideArea(){
      // Method to print to depth * height
      System.out.println("The side area is " + (depth*height)
            + " units squared.");
   }//printSideArea

   public static int numberOfBoxes(){
      return numberOfBoxes;
   }//numberOfBoxes

   //Method to accept an integer (volume needing stored) in units cubed and
   //returns the number of boxes required to store that volume.
   public int requiredBoxes(int volumeToBeStored){
      if (volumeToBeStored % volume() == 0){
         return volumeToBeStored/ volume();
      }//if
      else {
         return (volumeToBeStored/ volume()) + 1;
      }//else
   }//requiredBoxes
}//class
