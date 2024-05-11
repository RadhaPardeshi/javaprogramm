package EarlyInstntiation;

public class Simcard {
	private String serviceprovider;
	private long cno;
	
	public String getServiceprovider()
	{
		return serviceprovider;
	}
	
	public long getCno() {
		return cno;
	}
	Simcard(String serviceprovider,long cno)
	{
		this.cno = cno;
		this.serviceprovider=serviceprovider;
	}

}
