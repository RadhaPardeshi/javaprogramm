package Earlyandlateinstatiation;

public class Book {
      String title;
      double price;
      
      Author au=new Author("RD.Burman",55);
      
      Book(String title,double price){
    	  this.title=title;
    	  this.price=price;
      }
}
