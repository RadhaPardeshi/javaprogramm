package Study;

public class Demo7 {
	public static void main(String[] args) {
		System.out.println("Main Start");
		for(int i=1;i<=5;i++)
		{
			System.out.println("i ="+i);
		}
		try {
			Thread.sleep(1000);
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Main End");

	}

}
