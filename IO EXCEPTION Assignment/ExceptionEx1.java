import java.io.*;
public class ExceptionEx1 {
	
	public static void main(String... args) {
		
		int a=10/0;  // Arithmetic Exception
		
		int arr[]=new int[5];
		arr[5]=0;		// ArrayIndexOutOfBoundsException
		
		
		File file = new File("C:// file.txt"); 
		  
        FileReader fr = new FileReader(file);  //FileNotFoundException
        
		
		
	}
	

}
