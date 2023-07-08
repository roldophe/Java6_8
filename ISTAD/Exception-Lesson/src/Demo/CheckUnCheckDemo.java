package Demo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CheckUnCheckDemo {
    public static void main(String[] args) {
        //Checked vs unchecked
        //Runtime Exception -> run in order  find error
        //Compile Exception ->

        //this is called Checked Exception
        try {
            FileWriter fileWriter = new FileWriter("sourceFile.txt");
            fileWriter.write("hello!");
            fileWriter.close();
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
