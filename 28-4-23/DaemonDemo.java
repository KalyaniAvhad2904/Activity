package Thread;

public class DaemonDemo extends Thread
{
	public void run()
	{
		//checking if the thread is daemon or not
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("Daemon thread.");
		}
		else
			System.out.println("User thread.");
	}
	public static void main(String[] args) 
	{
		DaemonDemo d1 = new DaemonDemo();
		DaemonDemo d2 = new DaemonDemo();
		DaemonDemo d3 = new DaemonDemo();
		
		//setting daemon to be true
		
		d1.setDaemon(true);
		
		d1.start();
		d2.start();
		d3.start();
	}

}
