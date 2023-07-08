package ThrowAndThrows;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class throwsDemo{
    public static void writeFile() throws Exception{
        BufferedWriter bw = new BufferedWriter(
                new FileWriter("myFile.txt"));
        bw.write("Test");
        bw.close();
    }
    public static void main(String[] args) {
        try {
            writeFile();
        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
