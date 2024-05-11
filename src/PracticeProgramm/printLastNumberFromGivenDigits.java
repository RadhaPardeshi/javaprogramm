package PracticeProgramm;

public class printLastNumberFromGivenDigits {
	public static void main(String[] args) {
		int n=45896;
		while(n>0)
		{
			int res =n%10;
			System.out.println(res);
			n=n/10;
		}
	}

}
