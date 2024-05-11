package collections;

import java.util.ArrayList;
import java.util.TreeSet;

public class TreesetToArraylist {
    public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet();
		ts.add(20);
		ts.add(6);
		ts.add(90);
		ts.add(80);
		ts.add(6);
		ts.add(11);
		ts.add(20);
		System.out.println(ts);
		ArrayList<Integer> al=new ArrayList (ts);
		
		ArrayList <Integer> a2=new ArrayList<Integer>();
		
		for(Integer i :ts)
		{
			a2.add(0,i);
		}
		System.out.println(a2);
    }
}

