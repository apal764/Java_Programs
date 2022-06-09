import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		
		int x,y,temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of x :");
		x=sc.nextInt();
		System.out.println("Enter the value of y :");
		y=sc.nextInt();
		
		System.out.println("Before Swapping "+x+y);
		
		temp=x;
		x=y;
		y=temp;
		
		System.out.println("After swapping "+x+y);
		

	}

}
