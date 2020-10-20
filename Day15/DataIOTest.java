package Day15;

import java.io.*;

public class DataIOTest {

    public static void main(String[] args) {
        File file = new File("word.txt");
        try {
            FileOutputStream fs = new FileOutputStream(file);
            DataOutputStream ds = new DataOutputStream(fs);

            ds.writeUTF("使用UTF\n");
            ds.writeChars("使用Chars\n");
            ds.writeBytes("使用Bytes\n");

            FileInputStream fis = new FileInputStream(file);

            DataInputStream dis = new DataInputStream(fis);

            long length = file.length();

            //dis.readUTF();
            System.out.println(dis.readUTF());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
