package ui.json;


import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.File;
import java.io.FileReader;

public class JSONReader {
    private static String path = getOs();

    private static String getOs() {
        String OS = System.getProperty("os.name");
        if (OS.equals("Linux")) {
            path = "/var/lib/jenkins/workspace/americantaxi_project/src/main/resources";
        }
        if (OS.contains("Windows")) {
            path = "src/main/resources";
        }
        System.out.println("OS " + OS);
        return path;
    }

    public JSONObject readJson(String pathToJson) {
        JSONParser parser = new JSONParser();
        File file = new File(path);
        String absolutePath = file.getAbsolutePath() + pathToJson;
        try {

            Object obj = parser.parse(new FileReader(absolutePath));
            JSONObject jsonObject = (JSONObject) obj;
            return jsonObject;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }
}
