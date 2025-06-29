import java.io.*;

public class PrintFileInfo {

    public static void main(String[] args) {
        File f = new File("C:\\v\\OOP\\FileHandling\\file.txt");

        if(f.exists()) {
            System.out.println("File Name: "+ f.getName());
            System.out.println("File Location: "+ f.getAbsolutePath());
            System.out.println("File Writeable: "+ f.canWrite());
            System.out.println("File readable: "+ f.canRead());
            System.out.println("file length: "+ f.length());
            // System.out.println("File delete: " + f.delete());
        }
        else {
            System.out.println("File doesnt exist please create this file");
        }
    }
}

