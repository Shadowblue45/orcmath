package shadowBlue;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class textFileSaver {

	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("What text would you like to save?");
		String inputTxt = in.nextLine();
		 testSaveContent("test.txt",inputTxt);
	}

	 private static void testSaveContent(String fileName, String input) {
		 try{    
			 FileWriter fw=new FileWriter(fileName);    
			 fw.write(input);    
			 fw.close();    
			 System.out.println("Success! File \""+fileName+"\" saved!");
		 }
		 catch(IOException e){
			 System.out.println("An IOException was thrown. \nCheck to see that the directory where you tried to save the file actually exists.");
		 }
	}
}