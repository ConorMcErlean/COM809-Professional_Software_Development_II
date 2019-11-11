package Lab1;

/*
Created by Conor (mcerlean-c13@ulster.ac.uk) on 11/11/2019
Program to read in the weights of containers until -1 is entered and calculate
the cost of haulage depending on the number of containers and the total weight.
*/

import java.text.DecimalFormat;

public class Transport {
   public static void main(String[] args) {
      //Decimal Format
      DecimalFormat df = new DecimalFormat("0.00");

      // Variables
      int weight, totalWeight = 0, numberOfContainers = 0;
      final int TERMINATOR = -1;
      double cost = 0;

      Container container = new Container();

      // Get first weight
      weight = container.getWeight(1);
      //While loop
      while (weight != TERMINATOR){
         totalWeight += weight;
         numberOfContainers++;
         weight = container.getWeight(numberOfContainers);
         cost = container.calculateCost(numberOfContainers, totalWeight);
      }//While

      // Output
      System.out.println("The total number of containers is " +
            numberOfContainers);
      System.out.println("The total weight of the containers is " +
            totalWeight);
      System.out.println("The total cost of transport is £" + df.format(cost));

   }//main
}//class
