package Lab1;

import java.security.PublicKey;

/*
Created by pg19mec on 11/11/2019
Class defining structure of Car, using overloaded constructors & getter/setter methods.
 */
public class Car {
   private String colour;
   private String regNumber;
   private int noOfDoors;
   private boolean hasACD;

   public Car(){
   }//Default constructor.

   public Car(String reg, int doors){
      regNumber = reg;
      noOfDoors = doors;
   }// Alternate Constructor

   public Car(String reg, int doors, String carColour){
      regNumber = reg;
      noOfDoors = doors;
      colour = carColour;
      hasACD = false;
   }// Alternate constructor #2

   public Car(String carColour, String reg){
      colour = carColour;
      regNumber = reg;
      noOfDoors = 4; // A default value
      hasACD = false; // Default value
   }// Alternate constructor #3

   public Car(int doors, String reg){
      noOfDoors = doors;
      regNumber = reg;
      colour = "unknown"; // Default
      hasACD = false;   // Default
   }// Alternate Constructor #4

   public Car(String carColour, String reg, int doors, boolean cd){
      colour = carColour;
      regNumber = reg;
      noOfDoors = doors;
      hasACD = cd;
   }// Alternate Constructor #5 (All info supplied)

   // Setters
   public void setColour(String colour) {
      this.colour = colour;
   }

   public void setRegNumber(String regNumber) {
      this.regNumber = regNumber;
   }

   public void setNoOfDoors(int noOfDoors) {
      this.noOfDoors = noOfDoors;
   }

   public void setHasACD(boolean hasACD) {
      this.hasACD = hasACD;
   }

   // Getters
   public String getColour() {
      return colour;
   }

   public String getRegNumber() {
      return regNumber;
   }

   public int getNoOfDoors() {
      return noOfDoors;
   }

   public boolean getHasACD() {
      return hasACD;
   }

   // Method to print out all the details of a car
   public void printCarDetails(){
      System.out.println("CAR DETAILS");
      System.out.println("The registration of the car is " + regNumber);
      System.out.println("The colour of the car is " + colour);
      System.out.println("The car has " + noOfDoors + " doors");
      if (hasACD){
         System.out.println("The car has a CD");
      }//if
      else {
         System.out.println("The car does not have a CD");
      }//else
      System.out.println("=================");
   }//PrintCarDetails
}//class Car
