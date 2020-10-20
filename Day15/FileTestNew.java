package Day15;

import java.io.File;

public class FileTestNew {
    public static void main(String[] args) {
        File file = new File("word.txt");
        if (file.exists()) {
            String name = file.getName();
            long length = file.length();
            boolean hidden = file.isHidden();
            System.out.println("Name: " + name);
            System.out.println("Length:" + length);
            System.out.println("TorF: " + hidden);
        } else {
            System.out.println("None!");
        }
    }
}
