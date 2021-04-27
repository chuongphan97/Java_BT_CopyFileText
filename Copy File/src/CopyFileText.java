import java.io.*;

public class CopyFileText {
    public static void main(String[] args) {
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;
        try {
            File file = new File("text.txt");
            inputStream = new FileInputStream("text.txt");
            outputStream = new FileOutputStream("copy_text.txt");
            if (file.exists()){
                System.out.println("File already exist.");
            } else {
                file.createNewFile();
            }
            int line;
            while ((line = inputStream.read()) != -1){
                outputStream.write(line);
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
