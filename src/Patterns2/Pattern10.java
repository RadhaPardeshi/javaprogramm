package Patterns2;

public class Pattern10 {
	public static void main(String[] args) {
		int n=4;
		char ch='a';
		int sapce=1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i>=j) {
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
