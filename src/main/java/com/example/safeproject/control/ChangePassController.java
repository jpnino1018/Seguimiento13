package com.example.safeproject.control;

import com.example.safeproject.SafeApplication;
import com.example.safeproject.model.FileUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;

public class ChangePassController {

    @FXML
    private Button changeBTN;

    @FXML
    private TextField new1;

    @FXML
    private TextField new2;

    @FXML
    private TextField new3;

    @FXML
    private TextField new4;

    @FXML
    private TextField new5;

    @FXML
    private TextField new6;

    @FXML
    private TextField old1;

    @FXML
    private TextField old2;

    @FXML
    private TextField old3;

    @FXML
    private TextField old4;

    @FXML
    private TextField old5;

    @FXML
    private TextField old6;

    @FXML
    private Button returnBTN;
    @FXML
    public void onKey(KeyEvent event){

        if (event.getSource().equals(old1)){
            old2.requestFocus();
        }
        if (event.getSource().equals(old2)){
            old3.requestFocus();
        }
        if (event.getSource().equals(old3)){
            old4.requestFocus();
        }
        if (event.getSource().equals(old4)){
            old5.requestFocus();
        }
        if (event.getSource().equals(old5)){
            old6.requestFocus();
        }
        if (event.getSource().equals(old6)){
            new1.requestFocus();
        }
        if (event.getSource().equals(new1)){
            new2.requestFocus();
        }
        if (event.getSource().equals(new2)){
            new3.requestFocus();
        }
        if (event.getSource().equals(new3)){
            new4.requestFocus();
        }
        if (event.getSource().equals(new4)){
            new5.requestFocus();
        }
        if (event.getSource().equals(new5)){
            new6.requestFocus();
        }
    }

    @FXML
    void changePassword(ActionEvent event) throws FileNotFoundException {
        String tryPass =
                old1.getText() +
                        old2.getText() +
                        old3.getText() +
                        old4.getText() +
                        old5.getText() +
                        old6.getText();
        String newPass =
                new1.getText() +
                        new2.getText() +
                        new3.getText() +
                        new4.getText() +
                        new5.getText() +
                        new6.getText();
        if (tryPass.equals(FileUtils.readLine("src/main/resources/com/example/safeproject/pass.txt"))) {
            if (newPass.length() == 6){
                FileUtils.save(newPass, "src/main/resources/com/example/safeproject/pass.txt");
                SafeApplication.showWindow("Start.fxml");
                Stage current = (Stage) returnBTN.getScene().getWindow();
                current.hide();
            }else {
                FileUtils.alert();
            }
        }else{
            FileUtils.alert();
        }
    }

    @FXML
    void goBack(ActionEvent event) {
        SafeApplication.showWindow("Content.fxml");
        Stage current = (Stage) returnBTN.getScene().getWindow();
        current.hide();
    }
}
