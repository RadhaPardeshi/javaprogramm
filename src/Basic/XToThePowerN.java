package Basic;
import java.util.Scanner;
public class XToThePowerN {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter x value");
	int x=s.nextInt();
	System.out.println("Enter n value");
	int n=s.nextInt();
	int prod=1;
	while(n>0)
	{
		prod=prod*x;
		n--;
	}
	System.out.println(prod);
	
	}
}
