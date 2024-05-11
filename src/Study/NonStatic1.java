package Study;

public class NonStatic1 
{
	public static void main(String[] args) {
		
		NonStatic1 n=new NonStatic1();
		n.read();
		NonStatic1 n1=new NonStatic1();
		n1.read();
		System.out.println("Bye");
	}
	void read()
	{
		System.out.println("Hi");
	}
	

}
