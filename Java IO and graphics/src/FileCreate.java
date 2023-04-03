import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;



public class FileCreate {
    public void saveToFile(String filename, String text)throws IOException{
        File file = new File(filename);
        file.createNewFile();

        FileWriter fileWriter = new FileWriter(filename);
        BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
        writer.write(text);
        writer.close();


    }
}
