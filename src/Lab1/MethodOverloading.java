package Lab1;/*
Created by: Conor McErlean
Created on: 19/11/2019

Java Application to test method overloading
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class MethodOverloading {

   static Scanner keyboard = new Scanner(System.in);
   static DecimalFormat df = new DecimalFormat("0.00");

   // Method to calculate area of an equilateral triangle.
   public static double calculateArea(int pside){
      double area;
      area = Math.pow(pside, 2) * ((Math.sqrt(3))/4);
      return area;
   } // Equilateral

   //Method to calculate are of an isosceles triangle
   public static double calculateArea(int pside1,
                                      int pside2){
      //Find height
      double height = Math.sqrt((Math.pow(pside1, 2)
            - Math.pow((0.5 * pside2), 2)));
      //find area
      double area = 0.5 * pside2 * height;
      return area;

   }
   // Method to calculate the area of a scalene triangle
   public static double calculateArea(int pside1,
                                      int pside2, int pside3){
      double area;
      double semiperimeter = 0.5 * ( pside1 + pside2 + pside3);
      area = Math.sqrt((semiperimeter*(semiperimeter-pside1)*
            (semiperimeter-pside2)*(semiperimeter-pside3)));
      return area;
   }// Scalene

   public static void equilateralTriangle(){
      int equilateralSide;
      System.out.print("Enter the length of the side of an " +
            "equilateral triangle: ");
      equilateralSide = keyboard.nextInt();
      System.out.println("The area of the triangle is "
            + df.format(calculateArea(equilateralSide))
            + " units squared\n");
   }
   public static void isoscelesTriangle(){
      int equalSides, base;
      System.out.print("Enter the length of the  two sides of an " +
            "isosceles triangle: ");
      equalSides = keyboard.nextInt();
      System.out.print("Enter the length of the base of an " +
            "isosceles triangle: ");
      base =keyboard.nextInt();
      System.out.println("The area of the triangle is "
            + df.format(calculateArea(equalSides, base))
            + " units squared\n");
   }
   public static void scaleneTriangle(){
      int side1, side2, side3;
      System.out.print("Enter the length of the first side of an " +
            "scalene triangle: ");
      side1 = keyboard.nextInt();
      System.out.print("Enter the length of the second side of an " +
            "scalene triangle: ");
      side2 = keyboard.nextInt();
      System.out.print("Enter the length of the third side of an " +
            "scalene triangle: ");
      side3 = keyboard.nextInt();
      System.out.println("The area of the triangle is "
            + df.format(calculateArea(side1, side2, side3))
            + " units squared\n");
   }

   public static void main(String[] args){
     equilateralTriangle();
     isoscelesTriangle();
     scaleneTriangle();

   }//main
}//class
