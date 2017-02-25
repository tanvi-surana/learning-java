package thread;

public class MyTask implements Runnable{

	@Override
	public void run() {
		System.out.println("Running ...");
		System.out.println(Thread.currentThread().getName());
		
	}

}
