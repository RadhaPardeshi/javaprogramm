package exception;

public class Matrimony {
	
	public void ageVerification(int age)throws Exception
	{
		if(age<21)
		{
			throw new HavePatienceException("Control until your 21");
		}
		else if(age>60)
		{
			throw new OutOfServiceException("No Efficiency");
		}
		else
		{
			System.out.println("Welcome to matrimoney");
		}
	}
	

}
