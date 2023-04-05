public class Product
{
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,5};
		System.out.println(numProduct(arr));
	}
	 public static int numProduct(int[] arr)
	 {

	 	int product = 1;
	 	for(int i = 1;i <arr.length;i++)
	 	{
	 		product *= arr[i];
	 	}
	 	return product;

	 	
	 }
}
