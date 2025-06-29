import java.io.*;

public class FileWrite {
    public static void main(String[] args) throws Exception {
        try {
            FileWriter f = new FileWriter("C:\\v\\OOP\\FileHandling\\file.txt");
            try {
                f.write("This is my first file in which i put my details");

            } catch (Exception e) {
                System.out.println("Error Messgae: " + e);
            } finally {
                f.close();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("program exucated successfully");
    }
}
