import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string :");
		String str=sc.nextLine();
		String originalString=str;
		String rev="";
		
		int len=str.length();
		
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		
		System.out.println("the reverse of the string is :"+rev);
		
		if(originalString.equals(rev))
		{
			System.out.println("Palindome String");
		}
		else
		{
			System.out.println("Not a Palindome String");
		}

	}

}
