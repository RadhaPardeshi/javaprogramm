package Patterns;

public class VowelsInNames {
	public static void main(String[] args) {
		String [] st = {"Rakshith","Zoom","Chat"};
		
		for(int i=0;i<st.length;i++)
		{
			int vowel=0;
			char []ch = st[i].toCharArray();
			for(int j=0;j<ch.length;j++)
			{
			if(ch[j]=='A'||ch[j]=='E'||ch[j]=='O'||ch[j]=='I'||ch[j]=='U'||ch[j]=='a'||ch[j]=='e'||ch[j]=='i'||ch[j]=='o'||ch[j]=='u')
			{
				vowel++;
			}
			}
			System.out.println(st[i]+" : "+vowel);
		}
	}
	}
