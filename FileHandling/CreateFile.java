import java.io.*;

public class CreateFile {
    public static void main(String[] args) throws Exception{
        File f = new File("C:\\v\\OOP\\FileHandling\\file.txt");
    
        if(f.createNewFile()) {
            System.out.println("File created successfully");
        }
        else {
            System.err.println("file already exist");
        }   
    }
}

