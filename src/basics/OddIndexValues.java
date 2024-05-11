package basics;

public class OddIndexValues {
public static void main(String[] args) {
	int [] a= {10,55,8,9,33,54,7};
	
	for(int i=0;i<a.length;i++)
	{
		if(i%2==0)
			System.out.println(a[i]);
	}
}
}
