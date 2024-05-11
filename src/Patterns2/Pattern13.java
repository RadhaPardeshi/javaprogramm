package Patterns2;

public class Pattern13 {
	public static void main(String[] args) {
		int n=3;
		int a=1;
		for(int i=0;i<n;i++)
		{

			for(int j=0;j<n;j++)
			{
				if(i>=j) 
				{
					if(j%2==0) {
						System.out.print(a*a+" ");
						a++;
					}
					else {
						System.out.print(a*-a+" ");
						a++;
					}
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
