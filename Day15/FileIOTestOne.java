package Day15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;


/* FileOutputStream 和 FileInputStream*/
public class FileIOTestOne {
    public static void main(String[] args) {
        File file = new File("word.txt");
        try {
            FileOutputStream out = new FileOutputStream(file);
            byte buy[] = "\"我有一只王狗头\"".getBytes(); // 将对应内容转化为字节数组存入
            out.write(buy);
            out.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            FileInputStream in = new FileInputStream(file);
            byte byt[] = new byte[1024];
            int len = in.read(byt);
            System.out.println("The news: " + new String(byt, 0, len));
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
