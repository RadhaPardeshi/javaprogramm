package Patterns2;

public class Pattern11 {
	public static void main(String[] args) {
		int n=4;
		char ch='a';
		int a=1;
		for(int i=0;i<n;i++)
		{
			
			for(int j=0;j<n;j++)
			{
				if(i>=j) 
				{
					if(i%2==0)
					{
					System.out.print(ch+" ");
					ch++;
					}
					else
					{
						System.out.print(a+" ");
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
