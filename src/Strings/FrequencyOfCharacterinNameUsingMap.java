package Strings;

import java.util.HashMap;

public class FrequencyOfCharacterinNameUsingMap {
	
	public static void main(String[] args) {
		String s="Radha";
		char[] ch=s.toCharArray();
		HashMap<Character, Integer> hs=new HashMap();
		
		/*for(int i=0;i<hs.size();i++)
		{
			hs.put(ch[i], );
		}*/
		

		for(char c:ch)
		{
			System.out.println(c+"==>"+hs.get(c));
		}
		
	}

}
