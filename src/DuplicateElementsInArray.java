
public class DuplicateElementsInArray {

	public static void main(String[] args) {
		
		boolean flag=false;
		
		String arr[]= {"java","csharp","java","python","ruby"};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
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
