package arrays;

public class CombineTwoArray {

	 public static void main(String[] args) {
		int[]a= {2,4,6,8,10};
		int[]b= {1,3,5,7,9};
		
		int [] res = new int[a.length+b.length];
		
		for(int i=0;i<a.length;i++)
		{
			res[i]=a[i];
		}
		for(int i=0;i<res.length;i++)
		{
			res[i+a.length]=b[i];
		}
		for(int i=0;i<res.length;i++)
		{
			System.out.println(res[i]);
		}
		
	}
}
