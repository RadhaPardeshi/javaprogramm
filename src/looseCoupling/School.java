package looseCoupling;

public class School 
{
	String name;
	Student st;
	
	public void attendClass() 
	   {
		System.out.println("Attend class to gain Knowledge");
	   }
	
	School(String name)
		{
			this.name=name;
		}
		
	}
