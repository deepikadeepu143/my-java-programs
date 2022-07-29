class Producer extends Thread
{
	public void run()
	{
		try
		{
			for(int i = 0 ; i < 6 ; i++)
			{
				System.out.println("GET:" +i);
				sleep(500);
			}
		}
		catch(Exception e)
		{
			
		}
	}
}
class Consumer extends Thread
{
	public void run()
	{
		try
		{
			for(int i = 0 ; i < 6 ; i++)
			{
				System.out.println("PUT:" +i);
				sleep(500);
			}
		}
		catch(Exception e)
		{

		}
	}
}
class ProdCons
{
	public static void main(String[] args)
	{
		Producer p = new Producer();
		Consumer c = new Consumer();
		p.start();
		c.start();
	}
}