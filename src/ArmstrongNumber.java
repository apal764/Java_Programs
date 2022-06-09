import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=sc.nextInt();
		int temp=num;
		int r,sum=0;
		
		while(num!=0)
		{
			r=num%10;
			sum=sum+r*r*r;
			num=num/10;
		}
		System.out.println(sum);
		
		if(temp==sum)
		{
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println("Not a Armstrong Number");
		}

	}

}
