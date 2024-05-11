package TestYantraprogramms;

public class OccuranceOfString {

	public static void main(String[] args) {
		int ch [] = {1,3,1,3,4,5};

		for(int i=0;i<ch.length;i++)
		{
			int count =0;
			for (int j=0;j<ch.length;j++)
			{	
				boolean flag = false;
				if(ch[i]<=ch[j]) 
				{
                       if(ch[i]==ch[j])
                    	   {
                    	   flag = true;
                    	   }
				}
			}
			System.out.println(ch[i]+"=="+count);
		}
	}

}
