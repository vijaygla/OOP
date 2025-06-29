import java.io.*;

public class CopyFileContent {
    public static void main(String[] args) {
        try (
            FileInputStream r = new FileInputStream("C:\\v\\OOP\\FileHandling\\file.txt");
            FileOutputStream w = new FileOutputStream("C:\\v\\OOP\\FileHandling\\file1.txt");
        ) {
            int i;
            while ((i = r.read()) != -1) {
                w.write(i);
            }
            System.out.println("data copy successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

