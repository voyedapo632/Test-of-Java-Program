package syntaxeval;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String dataStr = loadFile("syntaxeval\\customCode.txt");

        dataStr = dataStr.replace("\n", "");

        System.out.println(dataStr);
    }

    public static String loadFile(String path) {
        String text = "";
        File file = new File(path);
        Scanner sn;

        try {
            sn = new Scanner(file);

            while (sn.hasNextLine()) {
                text += sn.nextLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

        return text;
    }
}
