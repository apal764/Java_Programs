
public class NoOfWordsInString {

	public static void main(String[] args) {
		
		String str="My Computer";
		int length=str.length();
		int count=1;
		
		char [] ch=str.toCharArray();
		for(int i=0;i<length;i++)
		{
			if((ch[i]==' ')&&ch[i+1]!=' ')
			{
				count++;
			}
		}
		System.out.println("No of words in string is :"+count);

	}

}
