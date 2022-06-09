import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string :");
		String str=sc.nextLine();
		
		StringBuilder str2=new StringBuilder();
		str2=str2.append(str);
		str2=str2.reverse();
		
		System.out.println("The reverse of the string is "+str2);

	}

}
