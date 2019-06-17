import java.io.File;
import java.io.FilenameFilter;
 
public class FileIOEx2  {
     
    public static void main(String a[]){
        File file = new File("C:/Java/");
        File[] files = file.listFiles(new FilenameFilter() {
             
            @Override
            public boolean accept(File dir, String name) {
                if(name.toLowerCase().endsWith(".txt")){
                    return true;
                } else {
                    return false;
                }
            }
        });
        for(File f:files){
            System.out.println(f.getName());
	f.delete();

        }
    }
}