package util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class FileUtility {
    public static void writeToFile(String fileName,String text) throws Exception {
        FileWriter fw = new FileWriter(fileName,true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(text);
        bw.close();
    }
}
