package Lab2;

/*
Created by Conor (mcerlean-c13@ulster.ac.uk) on 15/11/2019
CD class for recordings of musical albums on CD by a range of artists.
*/
public class CD {
   private static int cdNumber = 001;
   private int number, yearOfIssue;
   private String nameOfArtist, nameOfAlbum;
   private double costPrice, salePrice;
   private boolean single; //True represents a single CD false
                           // represents a double CD


   // Constructors
   public CD(){
      //Defaults
      number = cdNumber++;
      nameOfArtist = nameOfAlbum = "Unknown";
      costPrice = salePrice = 0.00;
      yearOfIssue = 2019;
      single = true;
   }//Default Constructor

   // Constructor with name of artist, name of album, year of issue & single.
   public CD(String artist, String album, int year, boolean singleOrNot){
      number = cdNumber++;
      nameOfArtist = artist;
      nameOfAlbum = album;
      yearOfIssue = year;
      single = singleOrNot;
      costPrice = salePrice = 9.99;
   }//Constructor

   // Constructor with all details.
   public CD(String artist, String album, int year, boolean singleOrNot,
             double price, double priceOnSale){
      number = cdNumber++;
      nameOfArtist = artist;
      nameOfAlbum = album;
      yearOfIssue = year;
      single = singleOrNot;
      costPrice = price;
      salePrice = priceOnSale;
   }//Constructor
}//class
