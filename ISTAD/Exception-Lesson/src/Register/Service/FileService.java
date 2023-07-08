package Register.Service;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class FileService {
    public static void save(String text) {
        File file = new File("C:/Users/MSI/Desktop/temp.txt");
        try{
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(text);
            bufferedWriter.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
