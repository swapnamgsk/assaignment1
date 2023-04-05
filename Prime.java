public class Prime
{
	public static void main(String[] args)
	{
		
		int num = -19;
		if(num == 0 || num ==1)
		{
			System.out.println("-1");
		}
		else
		{
			int count =0;
			for(int i = 1;i <= num; i++)
			{
				if(num %i == 0)
				{
					count++;
				}

			}
			if(count == 2)
			{
				System.out.println(num + " isprime");
			}
			else
			{
				System.out.println(num + " notprime");

			}
				
		}
	}
}
