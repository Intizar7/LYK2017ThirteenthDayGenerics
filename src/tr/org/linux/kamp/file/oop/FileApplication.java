package tr.org.linux.kamp.file.oop;

import java.util.Random;

public class FileApplication {
	
	public static void main(String[] args) {
		
		Random rand =new Random();
		DataFile dataFile =new DataFile();
		dataFile.setName("JAVA");
		dataFile.setSize(15);
		dataFile.setDateCreated("1 June 1990");
		System.out.println("File name : "+dataFile.getName()+" Size : "+dataFile.getSize()+" Date :"+dataFile.getDateCreated());
		HTMLFile htmlFile=new HTMLFile();
		
		
		
	}
	
}
