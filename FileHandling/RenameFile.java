import java.io.File;

public class RenameFile {
    public static void main(String[] args) {
        File  f = new File("C:\\v\\OOP\\FileHandling\\file0.txt");
        File  r = new File("C:\\v\\OOP\\FileHandling\\file1.txt");

        if(f.exists()) {
            System.out.println(f.renameTo(r));
        }
        else {
            System.out.println("file doesn't exist");
        }
    }
}

