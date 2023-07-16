package util;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtility {
    public static void writeToFile(String fileName,String text) throws Exception {
        FileWriter fw = new FileWriter(fileName,true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(text);
        bw.newLine();
        bw.close();
    }

    public static  List<String> readFromFile(String fileName) throws Exception {
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);
        List<String> list = new ArrayList<>();
        while (br.ready()){
            list.add(br.readLine());
        }
        return list;
    }
}
