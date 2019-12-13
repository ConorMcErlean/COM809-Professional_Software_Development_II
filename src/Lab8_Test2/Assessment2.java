package Lab8_Test2;

/*
Created by Conor (mcerlean-c13@ulster.ac.uk) on 13/12/2019
Created under test conditions.
*/
public class Assessment2 {

   /*
   Method1, initialise array, find the two smallest elements & print the two
   Smallest elements
    */
   private static void method1(){
      // local variables
      int smallest, secondSmallest;

      // Create the array called 'list'
      int [] list = {34, 56, 23, 35, 78, 44, 60, 20, 31, 61};

      // Find the two smallest elements

      // First put some data into our two positions
      smallest = secondSmallest = list[0];

      // Iterate through array
      for (int index = 0; index < list.length; index++){
         // check if second smallest
         if (list[index]< secondSmallest){
            // Check if smallest
            if (list[index] < smallest){
               // move smallest to second place
               secondSmallest = smallest;
               // add new smallest in
               smallest = list[index];
            }// if

            else{
               // If its not the smallest, but smaller than second smallest, we
               // have a new second smallest:
               secondSmallest = list[index];
            }//else
         }

      }//for

      // Print the two smallest elements
      System.out.println("The two smallest numbers in the list are " + smallest
      + " and " + secondSmallest + "\n");
   }//method1

   /* Method2 Initialise array, print each element, move each element 1 position
   to the left and the first element to the end (like a loop), print out the
   new list
    */
   private static void method2(){
      // Local variables
      int temp;

      // Initialise array
      int [] list = {34, 67, 23, 45, 69, 30};

      // Print each element
      System.out.print("List is ");
      for (int index = 0; index < list.length; index ++){
         System.out.print(list[index] + " ");
      }//for
      System.out.println();

      // Move each element

      // Place our first item into storage
      temp = list[0];

      //Iterate through (starting in our second position this time
      for (int index = 1; index < list.length; index++){
         list[index -1] = list[index];
      }//for
      // Put our stored first item at the end
      list[list.length - 1] = temp;

      // Print new list
      System.out.print("The new list is ");
      for (int index = 0; index < list.length; index ++){
         System.out.print(list[index] + " ");
      }//for
      System.out.println();
   }

   public static void main(String[] args) {
      method1();
      method2();
   }//main
}//class
