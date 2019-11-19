package Lab1;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
Created by Conor (mcerlean-c13@ulster.ac.uk) on 11/11/2019
COMMENTS ABOUT PROGRAM HERE
*/
public class Container {
   // Containers Variables
   private int weight;
   private double cost;

   public Container(){
   }// Constructor

   // Constants
   private static final int DISCOUNTNUMBER = 5, HIGHWEIGHT = 1000, HIGHCOST = 1200,
                      LOWWEIGHT = 500, MIDDLECOST =750, LOWCOST =400;
   private static final double DISCOUNTRATE = 0.25;

   public static int getWeight(int number) {
      int weight;
      // Scanner
      Scanner sc = new Scanner(System.in);
      //User prompt
      System.out.print("Please enter the weight of container " + number +
            " (in KG) or -1 to finish:");
      weight = sc.nextInt();
      return weight;
   }

   public static double calculateCost(int number, int weight){
      double cost;
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

   public static void main (String [] args) {
      // Variables and objects
      DecimalFormat df = new DecimalFormat("0.00");
      int weight = 0, totalweight = 0,
            numberOfContainers = 0;
      double cost;

      // While loop
      while (weight != -1){
         totalweight += weight;
         numberOfContainers++;
         weight = getWeight(numberOfContainers);
      }//while

      numberOfContainers--;
      cost = calculateCost(numberOfContainers, totalweight);
      System.out.println("The total number of containers is "
      + numberOfContainers);
      System.out.println("The total weight of the containers is "
      + totalweight);
      System.out.println("THe total cost of transport is £"
      +df.format(cost));
   }//main
}//class
