package Basic;
import java.util.Scanner;
public class Swapping {
   public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a value");
	int a =s.nextInt();
	System.out.println("Enter b value");
	int b=s.nextInt();
	System.out.println("Before Swapping");
	System.out.println("a :"+a);
	System.out.println("b :"+b);
	int temp=a;
	a=b;
	b=temp;
	System.out.println("After Swapping");
	System.out.println("a :"+a);
	System.out.println("b :"+b);
	
	
	
	
}

}
