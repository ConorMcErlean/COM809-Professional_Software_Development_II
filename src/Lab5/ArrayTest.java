package Lab5;

import java.util.Scanner;
/*
Created by Conor (mcerlean-c13@ulster.ac.uk) on 29/11/2019
Testing an array in class.
*/
public class ArrayTest {
   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      final int MAX = 6;
      int [] age = new int [MAX];
      int input, position = 0;

      System.out.print("Enter age 1: ");
      input = keyboard.nextInt();
      while (input!= -1){
         age[position] = input;
         position = position +1;
         System.out.print("Enter age " + (position +1) + ": ");
         input = keyboard.nextInt();
      }//while
//
//      for (int index = 0; index <MAX; index++){
//         System.out.println("Enter age " + (index+1) + ": ");
//         age[index] = keyboard.nextInt();
//      }//For

   }//main

}//class
