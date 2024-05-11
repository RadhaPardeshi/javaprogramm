package PracticeProgramm;

public class ProductOfGivenDigitNumber {
	public static void main(String[] args) {
		int n=45689;
		int prod=1;
		while(n>0)
		{
			int rem=n%10;
			prod=prod*rem;
			n=n/10;
		}
		System.out.println(prod);
	}

}
