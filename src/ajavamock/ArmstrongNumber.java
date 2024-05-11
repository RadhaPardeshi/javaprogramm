package ajavamock;

public class ArmstrongNumber {
	public static void main(String[] args) {
		
			int n=154;
			int temp = n;
			int temp1=n;
			int count=0;
		   while(n>0)
		   {
			   n=n/10;
			   count++;
		   }
		   int sum =0;
		   
		   while(temp>0)
		   {
			   int a=temp%10;
			   int prod=1;
			   for(int i=1;i<=count;i++)
			   {
				   prod=prod*a;
			   }
			   temp=temp/10;
			   sum=sum+prod;
		   }
		   if(sum==temp1)
			   System.out.println(temp1+" Armstrong Number");
		   else
			   System.out.println(temp1+" Not a Armstrong number");
		  

	}

}
