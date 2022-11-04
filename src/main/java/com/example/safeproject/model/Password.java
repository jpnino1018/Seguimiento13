package com.example.safeproject.model;

public class Password {

    private static Password pass;

    private Password(){
    }

    public static Password getInstance(){
        if (pass == null){
            pass = new Password();
        }
        return pass;
    }

    public String readPass(){
        return FileUtils.readLine("src/main/resources/com/example/safeproject/pass.txt");
    }

}
