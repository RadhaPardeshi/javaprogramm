package basics;

public class LargeNumber {
    public static void main(String[] args) {
		int [] a= {10,20,30,40,50,1};
		int large =a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]> large)
				large =a[i];
		}
		System.out.println(" Number is :"+large);
	}

}


