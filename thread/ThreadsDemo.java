package thread;

public class ThreadsDemo {
	
	public static void main(String[] args) {
		
		MyTask task=new MyTask();
		
		for(int i=0;i<10;i++)
		{
		   Thread thread=new Thread(task);
		   thread.setName("mythread"+i);
		   thread.start();
		}
		
	}

}
