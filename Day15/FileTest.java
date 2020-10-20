package Day15;

import java.io.File;

public class FileTest {
    public static void main(String[] args) {
        File file = new File("word.txt");
        if (file.exists())
            file.delete();
        else
        {
            try {
                file.createNewFile();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
