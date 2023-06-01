package multiThreading;


//public class MultiThreadExample extends Thread{
//or
public class MultiThreadExample implements Runnable{
	
	private int threadNo;
	public MultiThreadExample(int threadNo) {
		this.threadNo = threadNo;
	}
	
	@Override //Annotation
	public void run() {
		for(int i=0; i<=5; i++) {
			System.out.println(i+" ThreadNo: "+threadNo);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}}
	}

}
