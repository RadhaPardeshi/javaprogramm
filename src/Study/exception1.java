package Study;

public class exception1 {
	int x=20;
	public static void main(String[] args) {
	int a=50;
	int b=10;
	
	try {
		int c=a/b;
		System.out.println(c);
		exception1 e=new exception1();
		//e=null;
		System.out.println(e.x);
		
		int []arr = {10,20,30,40};
		//System.out.println(arr[5]);
		System.out.println(arr[0]);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
	}

}
