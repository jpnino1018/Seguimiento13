package com.example.safeproject.model;

import javafx.scene.control.Alert;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileUtils {

    public static String readFile(String path){
        StringBuilder output = new StringBuilder();
        File f = new File(path);
        try {
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(f)
                    )
            );
            String line;
            while ((line = reader.readLine()) != null){
                output.append(line).append("\n");
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return output.toString();
    }

    public static String readLine(String path) {
        String line = null;
        try {
            BufferedReader br;
            br = new BufferedReader(new InputStreamReader(new FileInputStream(path)));
            line = br.readLine();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return line;
    }

    public static void save(String info, String path){
        try {
            FileOutputStream fos = new FileOutputStream(path);
            fos.write( info.getBytes(StandardCharsets.UTF_8) );
            fos.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void alert(){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText("Watch out!");
        alert.setContentText("Password is invalid.");

        alert.showAndWait();
    }


}
