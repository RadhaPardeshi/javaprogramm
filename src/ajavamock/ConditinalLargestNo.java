package ajavamock;

public class ConditinalLargestNo {
	public static void main(String[] args) {
		int a=10;
		int b=45;
		int c=35;
		int d;
		
		d=(a > b)? (a>c ? a : c): (b>c ? b : c);
		
		System.out.println("Maximum number among "+ a +", "+ b + " and " + c + " is " + d);
		
		
		System.out.println("Other way to find among 3 no.largest no:");
		
		d=c >(a>b ? a: b ) ? c : ((a>b)? a : b);
		
		System.out.println("Largest number is "+d);
	}

}
