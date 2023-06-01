package filesystm;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;

public class FileSystem {
	
	
	static void readPropertiesFile(String Filepath) throws IOException {
		FileReader reader = new FileReader(Filepath);
		Properties prop = new Properties();
		prop.load(reader);
		
		
		//System.out.println(prop.getProperty(property));
		Set set = prop.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			Entry entry = (Entry) itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
	}
	
	static void writePropertyFile() throws IOException {
		FileWriter fw = new FileWriter("C:\\Users\\bindr\\eclipse-workspace\\javaProject\\src\\filesystm\\propfileWrite.properties");
		
		Properties prop = new Properties();
		prop.setProperty("name", "Mithun");
		prop.setProperty("Batch", "Jul");
		prop.store(fw, "xyz");
	}
	
	public static void main(String[] args) throws IOException {
		String filePath = "C:\\Users\\bindr\\eclipse-workspace\\javaProject\\src\\typeCasting\\BoxingUnboxing.txt";
		
		File f1 = new File(filePath);
		Scanner read = new Scanner(f1);
		while(read.hasNextLine()) {
			System.out.println(read.nextLine());
		}
		
		String filepath1 = "C:\\Users\\bindr\\eclipse-workspace\\javaProject\\src\\typeCasting\\demo.txt";
		
		File f2 = new File(filepath1);
		FileWriter demo = new  FileWriter(f2);
		f2.createNewFile(); 
		demo.write("Hello World");
		demo.close();
		
		String filePath3 = "C:\\Users\\bindr\\eclipse-workspace\\javaProject\\src\\filesystm\\propfile.properties";
		readPropertiesFile(filePath3);
		
		writePropertyFile();
	}

}
