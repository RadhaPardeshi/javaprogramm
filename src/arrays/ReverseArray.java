package arrays;

public class ReverseArray {
	public static void main(String[] args) {
		int[]a= {10,50,80,90,30};
		int start=0;
		int end=a.length-1;
		while(start<=end)
		{
			int temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			start=start+1;
			end=end-1;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
