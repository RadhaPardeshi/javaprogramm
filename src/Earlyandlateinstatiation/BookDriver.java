package Earlyandlateinstatiation;

public class BookDriver {
	public static void main(String[] args) {
		Book b=new Book("karma",595);
		System.out.println("BOOK TITLE :"+b.title);
		System.out.println("BOOK PRICE :"+b.price);
		System.out.println("AUTHOR NAME :"+b.au.name);
		System.out.println("AUTHOR AGE :"+b.au.age);
		System.out.println("HOUSE NO :"+b.au.ad.no);
		System.out.println("AREA NAME :"+b.au.ad.area);
		System.out.println("DISTRICT NAME :"+b.au.ad.district);
		System.out.println("COUNTRY NAME :"+b.au.ad.country);
	}

}
