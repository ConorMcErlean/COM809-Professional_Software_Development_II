package Lab2;

/*
Created by Conor (mcerlean-c13@ulster.ac.uk) on 15/11/2019
COMMENTS ABOUT PROGRAM HERE
*/
public class TestRequiredBoxes {
   public static void main(String[] args) {
      CardboardBox testBox = new CardboardBox(2,3,
            4);
      System.out.println("The required number of boxes is " +
            testBox.requiredBoxes(4000));
   }//main
}//class
