package PracticeProgramm;
import java.util.Scanner;
public class IndexPositionOfKeyElement {
	
	 public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("Enter key element");
		int key =s.nextInt();
		int count=0;
		int i=0;
		int[]a= {10,5,15,15,60,90,40};
		for( ;i<a.length;i++)
		{
			if (key==a[i])
			{
				count++;
				break;
			}
		}
		if (count==1)
			System.out.println("Key element is present in index of :"+i);
		
	 }
}
