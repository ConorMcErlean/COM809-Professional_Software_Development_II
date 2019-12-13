package Lab8_Test2;

import java.util.Scanner;

/*
Created by Conor (mcerlean-c13@ulster.ac.uk) on 13/12/2019
Created under test conditions
*/
public class ReverseNames {
   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);


      // Define the array and take in 5 values
      String [] names = new String[5];
      for (int index = 0; index < names.length; index++){
         System.out.print("Enter a name: ");
         names[index] = keyboard.nextLine();
      }

      // Print out the 5 names
      System.out.println("The names entered are:");
      for (int index = 0; index < names.length; index ++){
         System.out.print(names[index] + "\t");
      }//for
      System.out.println();

      // Print the 5 names reversed (not required to reverse the array,
      // just print in reverse order.

      System.out.println("The names reversed are:");
      for (int index = 1; index <= names.length; index ++){
         /*
         Take the 'index' from the length, start at 1 rather than 0 to avoid
         out of bounds error to get the array index values backwards, the print
         the name at that index value ie. 4, 3, 2, 1, 0.
          */
         System.out.print(names[names.length - index] + "\t");
      }//for
      System.out.println();
   }//main
}//class
