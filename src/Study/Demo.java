package Study;

public class Demo {
	
	int age;
	String name;
	Demo(int age ,String name)
	{
		this.age=age;
		this.name=name;
	}
	
	public String toString() {
		System.out.println("ID :"+age);
		System.out.println("NAME :"+name);
		return "";
	}
}
