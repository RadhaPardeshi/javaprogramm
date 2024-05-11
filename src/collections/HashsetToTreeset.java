package collections;

import java.util.HashSet;
import java.util.TreeSet;

public class HashsetToTreeset {
	public static void main(String[] args) {
          HashSet<Integer> hs=new HashSet ();
          hs.add(20);
          hs.add(55);
          hs.add(10);
          hs.add(66);
          hs.add(89);
          hs.add(55);
          hs.add(10);
          
          System.out.println(hs);
          TreeSet<Integer> ts=new TreeSet(hs);//Using Parameterized Constrouctor
          System.out.println(ts);
          TreeSet ts1=new TreeSet();
          
          for(int i=0;i<=hs.size();i++)
          {
        	  System.out.println(ts1.add(hs));
          }
          
 

          
          
	
	}

}
