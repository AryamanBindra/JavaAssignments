package multiThreading;

public class MultiThreadingDemo {
	
	public enum CarBrand{
		BMW, Audi, Merc, Lambo
	}
	
	enum weekdays{
		monday, tue, wed, thu
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		
//		
//		for(int i =1; i<=5; i++) {
//			MultiThreadExample mt = new MultiThreadExample(i);
//			//mt.start(); --> Used with Thread
//			Thread mythread = new Thread(mt);
//			mythread.start(); //0
//			mythread.join();
//			
//		}
//		MultiThreadExample mt = new MultiThreadExample();
//		MultiThreadExample mt2 = new MultiThreadExample();
//		mt.start();
//		mt2.start();
//		System.out.println(CarBrand.Audi);
		
//		CarBrand b = CarBrand.BMW;
//		if(b==CarBrand.BMW) {
//		}
		
		CarBrand[] b = CarBrand.values();
		for(CarBrand a : b) {
			System.out.println(a);
		}
		
		System.out.println(CarBrand.valueOf("BMW"));
		
		
	}
	
	

}
