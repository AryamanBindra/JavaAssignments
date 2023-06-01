package garbageCollector;

public class DemoGC {
	
	public static void main(String[] args) {
		Gb g1 = new Gb();
		Gb g2 = new Gb();
		
		g1 = null;
		g2 = null;
		
		
		// System / Runtime
		System.gc();
		// or
		Runtime.getRuntime().gc();
	}

}
