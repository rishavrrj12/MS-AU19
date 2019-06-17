import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionEx2 {
		
	public static void main(String... args) {
		
		try {
	
				
			int a=10/0;  // Arithmetic Exception
		
			int arr[]=new int[5];
			arr[5]=0;			// ArrayIndexOutOfBoundsException
		
		
		File file = new File("C:// file.txt"); 
		  
        FileReader fr = new FileReader(file);  //FileNotFoundException
		}
		catch(FileNotFoundException | ArithmeticException | ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		
}
}
