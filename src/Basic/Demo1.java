package Basic;
import java.util.Scanner;
public class Demo1 {
	public static void main(String[] args) {
     Scanner s =new Scanner (System.in);
     System.out.println("Enter one positive integer value");
     int n=s.nextInt();
     int count=0;
     int i=1;
     while(i<=n/2)
     {
    	 if (i*i==n) 
    	 {
    		 count++;
    		 break;
    	 }
    	 i++;
     }
     if (count==1)
    	System.out.println(i+"is a square root of "+n);
     else
    	 System.out.println(n+"is not a perfect square");	
	}
}
