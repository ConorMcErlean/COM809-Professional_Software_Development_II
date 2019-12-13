package Lab7;

import java.text.DecimalFormat;

/*
Created by Conor (mcerlean-c13@ulster.ac.uk) on 06/12/2019
Define a student class
*/
public class Student {
  DecimalFormat df = new DecimalFormat("00.00");
  // Class Variables
   private static int nextUniqueID= 1;

   // Instance Variables
   private int studentID;
   private String name;
   private int mark1, mark2, mark3;

   public Student(){
      studentID = nextUniqueID;
      nextUniqueID++;
   }// Default constructor

   public Student(String studentName){
      studentID = nextUniqueID;
      name = studentName;
      mark1 = 0;
      mark2 = 0;
      mark3 = 0;
      nextUniqueID++;
   }// Alternative constructor


}//class
