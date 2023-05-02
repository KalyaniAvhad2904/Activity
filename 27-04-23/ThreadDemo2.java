package Thread;

public class ThreadDemo2 extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			try
			{
				//sleep method is used to hold the thread for some time
				Thread.sleep(700); //500 milliseconds
			}
			catch(InterruptedException e)
			{
				System.out.println(e.getMessage());
			}
			System.out.println((i+"Name: "+Thread.currentThread().getName()+
					"Priority:"+Thread.currentThread().getPriority()));
		}
	}
	public static void main(String[] args) 
	{
		ThreadDemo2 t1 = new ThreadDemo2(); //new state
		ThreadDemo2 t2 = new ThreadDemo2();
		ThreadDemo2 t3 = new ThreadDemo2();
		ThreadDemo2 t4 = new ThreadDemo2();
		
		t1.setName("Thread-1");
		t2.setName("Thread-2");
		t3.setName("Thread-3");
		t4.setName("Thread-4");
		
		//Priority can only be set between 1 to 10
		//if the priority is set more than 10 then an exception IllegalArgumentException is thrown
		t1.setPriority(MAX_PRIORITY); //10
		t2.setPriority(MIN_PRIORITY); //1
		t3.setPriority(NORM_PRIORITY); //5(DEFAULT PRIORITY
		t4.setPriority(7); //7
		
		t1.start(); //runnable state
		//t1.start(); //it will throw IllegalArgumentException
		t2.start();
		t3.start();
		t4.start();
	}

}
