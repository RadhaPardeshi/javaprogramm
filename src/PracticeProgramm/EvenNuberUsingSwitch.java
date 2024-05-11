package PracticeProgramm;

public abstract class EvenNuberUsingSwitch {

	public static void main(String[] args) {
		int a=20;
		int b=a%2;
		switch(b)
		{
			case 0:
			{
				System.out.println(a+"is even Number");
			}
			break;
			default :
			{
				System.out.println(a+"is odd Number");
			}
		};

	}

}
