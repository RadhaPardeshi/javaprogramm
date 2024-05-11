package Study;

public class ThreadException {
	public static void main(String[] args) {
		System.out.println("Main Start");
		for(int i=0;i<=5;i++)
		{
			System.out.println(i);
		}
		try
		{
			Thread.sleep(200);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("Main end");
		
	}

}
