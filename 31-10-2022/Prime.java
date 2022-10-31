package Daily_Assignment;

public class Prime implements Runnable
{

	@Override
	public void run()
	{
		// TODO Auto-generated method stub
		int i = 0;
		int num = 0;
		String primeNo = "";

		for (i = 1; i <= 100; i++)
		{
			int counter = 0;
			for (num = i; num >= 1; num--) 
			{
				if (i % num == 0) {
					counter = counter + 1;
				}
			}
			if (counter == 2)
			{
				
				primeNo = primeNo + i + " ";
			}
		}
		System.out.println("Prime numbers from 1 to 100 are :");
		System.out.println(primeNo);

	}

}