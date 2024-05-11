package PracticeProgramm;

public class SumOfDigits {
	public static void main(String[] args) {
		int n=25789;
		int sum =0;
		while(n>0)
		{
			int res =n%10;
			sum=sum+res;
			n=n/10;
		}
		System.out.println(sum);
	}

}
