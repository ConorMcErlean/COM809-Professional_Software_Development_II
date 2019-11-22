package Lab1;/*
Created by: Conor McErlean
Created on: 19/11/2019

Additional Comments...
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class TestCar2 {
   public static void main(String[] args) {
      Car2 myCar = new Car2();
      Car2 sistersCar = new Car2(100, "Ford",
            "My sister Mary", "Red",
            2008, 105, 10995);
      Car2 bossCar = new Car2(101, "Honda",
            "Pat Bell", "Silver",
            2011, 210, 27500);
      Car2 aCar = new Car2(102, "Ford",
            "Janet Allison", "Red");
      Car2 bCar = new Car2(103, "John Smith",
            100);

//      myCar.printCarInfo();
//      sistersCar.printCarInfo();
//      bossCar.printCarInfo();
//      aCar.printCarInfo();
//      bCar.printCarInfo();
      bCar.setMake("Vauxhall");
      bCar.setOwnerName("James Rodgers");
      bCar.setYearOfManufacture(2012);
      bCar.setCostPrice(10000);
//      bCar.printCarInfo();

      Car2 cCar = new Car2();
      cCar.setId(104);
      cCar.setMake("Toyota");
      cCar.setOwnerName("Robert Smith");
      cCar.setColour("Blue");
      cCar.setYearOfManufacture(2010);
      cCar.setTopSpeed(120);
      cCar.setCostPrice(12000);
//      cCar.printCarInfo();
//
//      System.out.println("BCar make is " + bCar.getMake());
//      System.out.println("BCar colour is " + bCar.getColour());
//      System.out.println("BCar was made in " + bCar.getYearOfManufacture());

//      System.out.println("The age of cCar is " + cCar.ageOfCar() + " Years old");
//      System.out.println("The age of aCar is " + aCar.ageOfCar() + " Years old");

//      System.out.print("Please enter the rate of depreciation in %:");
//      Scanner kb = new Scanner(System.in);
//      DecimalFormat df = new DecimalFormat("£0.00");
//      int depreciationRate = kb.nextInt();
//      System.out.println("Current price of cCar is " +
//           df.format(cCar.currentValue(depreciationRate)) );
      System.out.println("Total number of cars is " + Car2.numberOfCars() );

   }//main
}//class
