package PracticeProgramm;
import java.util.Scanner;
public class SearchingArrayElement {
 public static void main(String[] args) {
	Scanner s=new Scanner (System.in);
	System.out.println("Eneter key element");
	int key =s.nextInt();
	int count=0;
	int[]a= {10,5,15,15,60,90,40};
	for(int i=0;i<a.length;i++)
	{
		if (key==a[i])
		{
			count++;
			break;
		}
	}
	if (count==1)
		System.out.println("Key element is present");
	else
	   System.out.println("Key element is not present ");
 }
}
