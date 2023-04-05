class reverseWhile
 
{
        public static String str="Swapna Govindayya";
	public static char [] strArray=str.toCharArray();
	public static void main(String [] args)
	{
		System.out.println(strArray);
		reverseString(0,strArray.length-1,strArray);
		System.out.println(strArray);
	}
	public static void reverseString(int start,int end,char [] strArray)
	{
		
    		while(start <= end)
    		{
    			char temp = strArray[start];
    			
    			strArray[start] = strArray[end];
    			
    			strArray[end] = temp;
    			
    			start++;
    			end--;
    		}
    	}
    		
    }
    
