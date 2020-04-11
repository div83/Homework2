package Processing;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * @author Irina Goncharova
 */
public class Reading {
    // считывание предложений из оригинального текста
    private String path;
    private boolean isFound;

    public boolean getIsFound() {
        return isFound;
    }

    public Reading(String path) {
        this.path = path;
    }

    public String readFromFile() {

        String origText;
        StringBuilder stringBuilder = new StringBuilder("");

        try (FileInputStream inputStream = new FileInputStream(path);
             InputStreamReader reader = new InputStreamReader(inputStream);
             BufferedReader bufferedReader = new BufferedReader(reader))
        {
            isFound = true;
            while (bufferedReader.ready()) {
                String s = bufferedReader.readLine();
                stringBuilder.append(s).append("\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        origText = stringBuilder.toString();
        return origText;
    }
}
