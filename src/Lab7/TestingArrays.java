package Lab7;

/*
Created by Conor (mcerlean-c13@ulster.ac.uk) on 13/12/2019
COMMENTS ABOUT PROGRAM HERE
*/
public class TestingArrays {
   public static void main(String[] args) {

      boolean [][] test = new boolean[4][4];

      for (int rowindex = 0; rowindex< test.length; rowindex++){
         for (int columnindex=0; columnindex< test[rowindex].length; columnindex++){
            System.out.print(test[rowindex][columnindex]);
         }
         System.out.println();
      }

      int [] numbers = {45, 55, 65, 76,78};
   }//main
}//class
