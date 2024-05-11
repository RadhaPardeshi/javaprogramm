package Study;

public class Demo8 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main Start");
		for(int i=1;i<=5;i++)
		{
			System.out.println("i ="+i);
		}
		try {
			Thread.sleep(1000);
		} 
		finally 
		{
			System.out.println("Final Block executed");
		}
		System.out.println("Main End");
	}
}
