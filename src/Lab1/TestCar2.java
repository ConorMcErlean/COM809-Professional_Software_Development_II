package Lab1;/*
Created by: Conor McErlean
Created on: 19/11/2019

Additional Comments...
*/

public class TestCar2 {
   public static void main(String[] args) {
      Car2 myCar = new Car2();
      Car2 sistersCar = new Car2(100, "Ford",
            "My sister Mary", "Red",
            2008, 105, 10995);
      Car2 bossCar = new Car2(101, "Honda",
            "Pat Bell", "Silver",
            2011, 210, 27500);
      Car2 aCar = new Car2(102, "Ford",
            "Janet Allison", "Red");
      Car2 bCar = new Car2(103, "John Smith",
            100);

      myCar.printCarInfo();
      sistersCar.printCarInfo();
      bossCar.printCarInfo();
      aCar.printCarInfo();
      bCar.printCarInfo();
   }//main
}//class
