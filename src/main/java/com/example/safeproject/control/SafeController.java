package com.example.safeproject.control;

import com.example.safeproject.SafeApplication;
import com.example.safeproject.model.FileUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class SafeController {
    @FXML
    private TextField pass1;
    @FXML
    private TextField pass2;
    @FXML
    private TextField pass3;
    @FXML
    private TextField pass4;
    @FXML
    private TextField pass5;
    @FXML
    private TextField pass6;
    @FXML
    private Button openBTN;

    @FXML
    public void onKey(KeyEvent event){

        if (event.getSource().equals(pass1)){
            pass2.requestFocus();
        }
        if (event.getSource().equals(pass2)){
            pass3.requestFocus();
        }
        if (event.getSource().equals(pass3)){
            pass4.requestFocus();
        }
        if (event.getSource().equals(pass4)){
            pass5.requestFocus();
        }
        if (event.getSource().equals(pass5)){
            pass6.requestFocus();
        }
    }

    @FXML
    void openContent(ActionEvent event){
        String tryPass =
                pass1.getText() +
                        pass2.getText() +
                        pass3.getText() +
                        pass4.getText() +
                        pass5.getText() +
                        pass6.getText();

        if (tryPass.equals(FileUtils.readLine("src/main/resources/com/example/safeproject/pass.txt"))) {
            SafeApplication.showWindow("Content.fxml");
            Stage current = (Stage) openBTN.getScene().getWindow();
            current.hide();

        } else {
            FileUtils.alert();
        }
    }
}