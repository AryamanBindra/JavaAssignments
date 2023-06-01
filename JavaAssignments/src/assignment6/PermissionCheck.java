package assignment6;

import java.io.File;

public class PermissionCheck {
	
	public static void main(String[] args) {
		File fl = new File("C:\\Users\\bindr\\eclipse-workspace\\javaProject\\src\\filesystm");
		if(fl.canRead()&& fl.canWrite()) {
			System.out.println("File/Directory has read and write permission");
		}	
	}
}

