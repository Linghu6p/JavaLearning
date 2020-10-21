package Day15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

//具体内容详情见p284 暂无后续说明

public class ZipIOTest {

    private void zip(String zipFileName, File inputFile) throws Exception {
        ZipOutputStream out = new ZipOutputStream(new FileOutputStream(zipFileName));
        zip(out, inputFile, "");
        System.out.println("压缩中...");
        out.close();
    }

    private void zip(ZipOutputStream out, File f, String base) throws Exception {
        if (f.isDirectory()) {//测试是否在同一目录
            File[] fl = f.listFiles();
            if (base.length() != 0) {
                out.putNextEntry(new ZipEntry(base + "/"));
            }
            for (int i = 0; i < fl.length; ++i)
                zip(out, fl[i], base + fl[i]);
        } else {
            out.putNextEntry(new ZipEntry(base));
            FileInputStream in = new FileInputStream(f);
            int b;
            System.out.println(base);
            while ((b = in.read()) != -1)
                out.write(b);
            in.close();
        }
    }
    public static void main(String[] args) {
        ZipIOTest book= new ZipIOTest();
        try {
            book.zip("F:/Hello.zip",new File("F:/Hello"));
            System.out.println("Finished");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
