import java.io.*;

class Type {
	public static void main(String []files) {
		// process each file passed as argument 
		for(String file : files) {
			// try opening the file with FileReader 
			try (FileReader inputFile = new FileReader(file)) { 
				int ch = 0; 
				while( (ch = inputFile.read()) != -1) {
					// ch is of type int - convert it back to char
					System.out.print( (char)ch ); 
				}
			} catch (FileNotFoundException fnfe) {
				System.err.printf("Cannot open the given file %s ", file);
			}
			catch(IOException ioe) {
				System.err.printf("Error when processing file %s; skipping it", file);
			} 
			// try-with-resources will automatically release FileReader object  
		}
	}
}
