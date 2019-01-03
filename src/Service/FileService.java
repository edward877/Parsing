package Service;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileService {

    public static List<String> getFileTextLine(File file, int maxNumberLine) {
        List<String> lines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (maxNumberLine > 0 && lines.size() == maxNumberLine) {
                    break;
                }
                lines.add(line);
            }
        } catch (Exception e) {
            System.out.println("Log error in Service.FileService: " + e.getMessage());
        }
        return  lines;
    }
}
