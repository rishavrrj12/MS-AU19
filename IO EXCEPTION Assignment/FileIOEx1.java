import java.io.File;
 
public class FileIOEx1 {
 
    public void listAllFiles(String path) {
 
        File root = new File(path);
        File list[] = root.listFiles();
 
        if (list != null) { 
            for (File f : list) {
                if (f.isDirectory()) {
                    System.out.println(f.getAbsoluteFile());
                    listAllFiles(f.getAbsolutePath());
                } else {
                    System.out.println(f.getAbsoluteFile());
                }
            }
        }
 
    }
 
    public static void main(String[] args) {
    	FileIOEx1 ff = new FileIOEx1();
        String path = "c:\\Java";
        ff.listAllFiles(path);
    }
}