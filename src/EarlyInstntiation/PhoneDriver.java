package EarlyInstntiation;

public class PhoneDriver {
	public static void main(String[] args) {
		
		Phone p=new Phone ("MOTOROLA","BLACK");
		System.out.println("PHONE BARND :"+p.brand);
		System.out.println("PHONE COLOUR :"+p.colour);
		System.out.println("SIM SERVICE PROVIDER :"+p.s.getServiceprovider());
		System.out.println("SIM CONTACT NO :"+p.s.getCno());
	}

}
