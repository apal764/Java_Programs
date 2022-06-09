import java.util.Arrays;

public class HighestElementInArray {

	public static void main(String[] args) {
		
		int arr[]= {4,6,3,5,9,23,21,45,3,8};
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("Highest element :"+arr[arr.length-1]);
		System.out.println("2nd element :"+arr[arr.length-2]);
		System.out.println("3rd element :"+arr[arr.length-3]);

	}

}
