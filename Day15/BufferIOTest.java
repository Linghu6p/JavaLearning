package Day15;


import java.io.*;
import java.nio.Buffer;

public class BufferIOTest {

    public static void main(String[] args) {
        String content[] = new String[]{"Hello", "Hi", "Bye"};
        File file = new File("word.txt");
        System.out.println(content.length);
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bufw = new BufferedWriter(fw);


            for (int k = 0; k < content.length; ++k) {
                bufw.write(content[k]);
                bufw.newLine();//以单行的形式写入
            }
            bufw.close();
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            FileReader fr = new FileReader(file);
            BufferedReader bufr = new BufferedReader(fr);
            String s = null;
            int i = 0;
            while ((s = bufr.readLine()) != null) {
                i++;
                System.out.println("第" + i + "行:" + s);
            }
            bufr.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
