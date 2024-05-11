package Patterns2;

public class Pattern7 {
	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<n;i++)
		{
			char ch='a';
			for(int j=0;j<n;j++)
			{
				if(i>=j) 
				{
					System.out.print(ch+" ");
					ch++;
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
