package Study;

public class Demo3 {
	public static void main(String[] args) {
		Thread t=new Thread();
		System.out.println("Thread ID :"+t.getId());
		System.out.println("Thread Name :"+t.getName());
		System.out.println("Thread Priority :"+t.getPriority());
		
		t.setName("Dinga2");
		t.setPriority(2);
		
		System.out.println("Thread ID :"+t.getId());
		System.out.println("Thread Name :"+t.getName());
		System.out.println("Thread Priority :"+t.getPriority());
	}

}
