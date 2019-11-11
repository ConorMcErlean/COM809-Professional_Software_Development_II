package Lab1;

import java.sql.SQLOutput;
import java.util.Scanner;

/*
Created by Conor (mcerlean-c13@ulster.ac.uk) on 11/11/2019
COMMENTS ABOUT PROGRAM HERE
*/
public class Container {
   // Containers Variables
   private int weight;
   private double cost;

   // Constants
   private final int DISCOUNTNUMBER = 5, HIGHWEIGHT = 1000, HIGHCOST = 1200,
                      LOWWEIGHT = 500, MIDDLECOST =750, LOWCOST =400;
   private final double DISCOUNTRATE = 0.25;

   public int getWeight(int number) {
      // Scanner
      Scanner sc = new Scanner(System.in);
      //User prompt
      System.out.print("Please enter the weight of container" + number +
            " (in KG) or -1 to finish:");
      weight = sc.nextInt();
      return weight;
   }

   public double calculateCost(int number, int weight){
      if (weight > HIGHWEIGHT){
         cost = HIGHCOST;
      }//if
      else{
         if(weight > LOWWEIGHT){
            cost = MIDDLECOST;
         }// if
         else {
            cost = LOWCOST;
         }
      }// else
      if (number <= DISCOUNTNUMBER){
         cost -= cost*DISCOUNTRATE;
      }
      return cost;
   }

}//class
