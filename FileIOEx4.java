import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class FileIOEx4 {

	public static void main(String... args ) throws IOException
	{
		String from = "C:\\Java\\Demo1.txt";
		String to = "C:\\New_dir\\Demo3.txt";
		
		Path src = Paths.get(from);
        Path dest = Paths.get(to);
        Files.copy(src, dest);
		
		
	}
}
