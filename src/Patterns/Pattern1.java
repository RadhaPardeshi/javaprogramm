package Patterns;

public class Pattern1 {
	public static void main(String[] args) {
		int n=4;  int a=1; int b=1;
		for(int i=0;i<n;i++)
		{
	        
			for(int j=0;j<n;j++)
			{
				if(a<=9)
				{System.out.print(a+" ");
				a++;
			    }
				else {
					System.out.print(b+" ");
					b++;
				}
			}
			System.out.println();
		}
	}

}
