
public class DuplicateCharactersInString {

	public static void main(String[] args) {
		
		
		String str= "java";
		boolean flag=false;
		char []ch=str.toCharArray();
		
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(ch[i]==ch[j])
				{
					System.out.println("Duplicate elements found");
				    flag=true;
				}
			}	
		}
		if(flag==false)
		{
			System.out.println("Duplicate elements not found");
		}

	}

}
