import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string :");
		String str=sc.nextLine();
		String rev="";
		
		/*int len=str.length();
		
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		
		System.out.println("the reverse of the string is :"+rev);

	}*/
	
	//Method 2:
	
		/*char a[]=str.toCharArray();
		int len=a.length;
		
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+a[i];
		}
		System.out.println("the reverse of the string is :"+rev);

	
	}*/
		
		//Method 3:
		
		StringBuilder sb=new StringBuilder(str);
		System.out.println(sb.reverse());
	}
			
}
