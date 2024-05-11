package basics;

public class Sum {
    public static void main(String[] args) {
    			int [] a= {10,20,30,40,50,1};
    			int small=a[0];
    			for(int i=0;i<a.length;i++)
    			{
    				if(a[i]< small)
    					small=a[i];
    			}
    			System.out.println("Smallest Number is :"+small);
    		}

    }

