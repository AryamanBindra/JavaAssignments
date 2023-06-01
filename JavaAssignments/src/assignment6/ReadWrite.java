package assignment6;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadWrite {
	public static void main(String[] args) throws IOException {
		File fl = new File("C:\\Users\\bindr\\eclipse-workspace\\javaProject\\src\\typeCasting\\demo.txt");
		Scanner read = new Scanner(fl);
		FileWriter write = new FileWriter(fl);
		write.write("Hey! How's it going?");
		write.append("\nI'm doing great! Thanks <:^>");
		write.close();
		while(read.hasNext()) {
			System.out.println(read.nextLine());
		}
	}
}

