import java.io.*;
public class FileIOEx3 {
	public static void main(String... args) {
		
		try {
			FileReader fr = new FileReader("C:\\Java\\Demo1.txt");
		
			BufferedReader br = new BufferedReader(fr);
			
			FileWriter fw = new FileWriter("C:\\Java\\Demo2.txt", true);
			
			String s;
 
			while ((s = br.readLine()) != null) { 	// read a line
				fw.write(s);						 // write to output file
				fw.flush();
			}
			br.close();
			fw.close();
                      
		} 
		catch (IOException e) {
				e.printStackTrace();
		}
		
	}
	

}
