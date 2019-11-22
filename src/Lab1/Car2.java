package Lab1;/*
Created by: Conor McErlean
Created on: 19/11/2019

Additional Comments...
*/

import java.time.Year;
import java.util.Calendar;

public class Car2 {
   // Class Variables
   private int id, yearOfManufacture, topSpeed;
   private String make, ownerName, colour;
   private double costPrice;
   private static int numberOfCars = 0;

   // Constructors
   public Car2(){
      numberOfCars++;
   }// Default

   public Car2(int carID, String carMake, String carOwner,
               String carColour, int carYearofMan,
               int topSpeed, double carPrice){
      numberOfCars++;
      id = carID;
      make = carMake;
      ownerName = carOwner;
      colour = carColour;
      yearOfManufacture = carYearofMan;
      this.topSpeed = topSpeed;
      costPrice = carPrice;
   } // All values assigned constructor

   public Car2(int id, String make, String owner, String colour){
      numberOfCars++;
      this.id = id;
      this.make = make;
      ownerName = owner;
      this.colour = colour;
      yearOfManufacture = 2009;  //Default value
      topSpeed = 120;            //Default value
      costPrice = 12000;         //Default value
   } // 4 Parameter constructor

   public Car2(int id, String owner, int topSpeed){
      numberOfCars++;
      this.id = id;
      ownerName = owner;
      this.topSpeed = topSpeed;
      make = "Unknown";          //Default
      colour = "Red";            //Default
      yearOfManufacture = 2009;  //Default
      costPrice = 12000;         //Default
   } // 3 Parameter constructor

   public void printCarInfo(){
      System.out.println("The ID is " + id);
      System.out.println("The make is " + make);
      System.out.println("The owner is " + ownerName);
      System.out.println("The colour is " + colour);
      System.out.println("The year of manufacture is "
            + yearOfManufacture);
      System.out.println("The top speed is " + topSpeed + "mph");
      System.out.println("The price is £" + costPrice);
      System.out.println("\n");
   }//printCarInfo

   //Getters & Setters

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public int getYearOfManufacture() {
      return yearOfManufacture;
   }

   public void setYearOfManufacture(int yearOfManufacture) {
      this.yearOfManufacture = yearOfManufacture;
   }

   public int getTopSpeed() {
      return topSpeed;
   }

   public void setTopSpeed(int topSpeed) {
      this.topSpeed = topSpeed;
   }

   public String getMake() {
      return make;
   }

   public void setMake(String make) {
      this.make = make;
   }

   public String getOwnerName() {
      return ownerName;
   }

   public void setOwnerName(String ownerName) {
      this.ownerName = ownerName;
   }

   public String getColour() {
      return colour;
   }

   public void setColour(String colour) {
      this.colour = colour;
   }

   public double getCostPrice() {
      return costPrice;
   }

   public void setCostPrice(double costPrice) {
      this.costPrice = costPrice;
   }

   public int ageOfCar(){
      if (yearOfManufacture > 0) {
         int age;
         System.out.println(yearOfManufacture);
         Calendar c = Calendar.getInstance();


//       System.out.println("Current year: " + c.getWeekYear());
//        System.out.println("Manufacture year: " + yearOfManufacture);
         age = c.getWeekYear() - yearOfManufacture;
         return age;
      }//if
      else{
         return -1;
      }//else
   }//ageOfCar

   //Accepts double value (deprication in %) and returns current value of car
   public double currentValue(double depreciationRate) {
      if ((costPrice>0) && (ageOfCar() != -1)) {
         double currentValue = costPrice - (costPrice * (depreciationRate / 100) *
               ageOfCar());
         return currentValue;
      }//if
      else return -1;

   }//current Value

   public static int numberOfCars(){
      return numberOfCars;
   }
}//class
