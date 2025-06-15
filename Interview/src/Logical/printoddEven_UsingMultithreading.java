package Logical;

public class printoddEven_UsingMultithreading {
	private static final int max_num=10;
	private static volatile int counter=1;
	private static final Object lock=new Object();
	
public static void main(String[] args) {
	Thread evenThread=new Thread(new EvenPrint());
	Thread oddThread=new Thread(new oddPrint());
	
	evenThread.start();
	oddThread.start();
}
private static class EvenPrint implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (counter<=max_num) {
			synchronized (lock) {
				if(counter %2==0) {
					System.out.println("Even: "+counter);
					counter++;
					lock.notifyAll();
				
				}
				else {
					try {
						lock.wait();
					}
					catch (Exception e) {
						Thread.currentThread().interrupt();
						// TODO: handle exception
					}
				}
				
			}
		}
		
	}
	
}
private static class oddPrint implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (counter<=max_num) {
			synchronized (lock) {
				if(counter %2!=0) {
					System.out.println("odd: "+counter);
					counter++;
					lock.notifyAll();
				
				}
				else {
					try {
						lock.wait();
					}
					catch (Exception e) {
						Thread.currentThread().interrupt();
						// TODO: handle exception
					}
				}
				
			}
		
		
	}
	
	}}
}
