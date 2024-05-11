package basics;
import java.util.Scanner;
public class A2 {
	
	public static void main(String[] args) 
	{
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter any positive integer value");
    int a =sc.nextInt();//Initialization by user
    
    while(a>0)//condition
    {
    	int res=a%10;
    	System.out.println(res);
    	a=a/10;//Updation
    }
	}
}
