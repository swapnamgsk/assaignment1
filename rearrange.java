class rearrange
{
       
        
        //out.put = [2,4,6,8,3,5,1]
	public static void main(String[] args)
	{ 	 
		int[] array = {2,3,4,6,5,1,8};
		int start = 0;
		int end = array.length-1;
		
		while(start < end)
		{
			while(array[start] % 2 ==0)
			{
				start++;
			}
			while(array[end] % 2 != 0)
			{
				end--;
			}
			
			if(start < end)
			{
				int temp = array[start];
				array[start] = array[end];
				array[end] = temp;
				start++;
				end--;
			}
		}
		
		
		for(int i =0 ;i< array.length;i++)
		{
			System.out.print(array[i] + " ");
		}
	}
}
