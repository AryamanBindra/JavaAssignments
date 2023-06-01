package Abstraction;

public class Samsung extends Mobile {
	
	public Samsung() {
		System.out.println("Samsung");
		}

//	@Override
	void makeCall() {
		System.out.println("Make a call");
		
	}

//	@Override
	void sendSms() {
		System.out.println("Send an Sms");		
	}

//	@Override
	void recordVideo() {
		System.out.println("Record Video");		
	}
	
	public static void main(String[] args) {
		Samsung s1 = new Samsung();
		s1.makeCall();
		s1.sendSms();
		s1.recordVideo();
		s1.takePic();
	}

}
