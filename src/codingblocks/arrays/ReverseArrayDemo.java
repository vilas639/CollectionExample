package codingblocks.arrays;

public class ReverseArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {1,2,3,4,5,6};
		//reverseArray(arr);
		reverseArrayInPlace(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}

	private static void reverseArrayInPlace(int[] arr) {
		// TODO Auto-generated method stub
		int i=0;
		int j=arr.length-1;
		
	while(i<j)
		{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		i++;
		j--;
		}
		
	}

	

}
