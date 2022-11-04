package com.example.safeproject.model;

public class Content {

    private static Content content;

    private Content(){

    }

    public static Content getInstance(){
        if (content == null){
            content = new Content();
        }
        return content;
    }

    public String readContent(){
        return FileUtils.readFile("src/main/resources/com/example/safeproject/content.txt");
    }
}
