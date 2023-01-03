import java.io.*;
public class FileNotFoundPractise {
	public static void findFile() throws IOException{
		//explicitly throwing the exception.
		throw new IOException("File not found.");
		
	}

	public static void main(String[] args) {
		try {
			findFile();
		}
		catch(IOException e) 
		{
			System.out.println("IOException  is caught."+ e.getMessage());
		}
		

	}

}
