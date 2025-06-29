import java.io.FileReader;

public class FileRead {
    public static void main(String[] args) {

        try {
            FileReader f = new FileReader("C:\\v\\OOP\\FileHandling\\file.txt");
            try {
                int i;
                while ((i = f.read()) != -1) {
                    System.out.print((char) i);
                }
            } finally {
                f.close();
            }
        } catch (Exception e) {
            System.out.println("Exception handled");
        }
    }
}

