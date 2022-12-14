package com.example.safeproject.control;
import com.example.safeproject.model.Content;
import com.example.safeproject.SafeApplication;
import com.example.safeproject.model.FileUtils;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import java.net.URL;
import java.util.ResourceBundle;

public class ContentController implements Initializable {

    @FXML
    private Button changePassBTN;

    @FXML
    private Button closeBTN;

    @FXML
    private TextArea contentTA;

    @FXML
    void openChangePass(){
        saveInfoOnTA();
        SafeApplication.showWindow("ChangePass.fxml");
        Stage current = (Stage) changePassBTN.getScene().getWindow();
        current.hide();
    }

    @FXML
    void closeApp(){
        saveInfoOnTA();
        System.exit(0);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        Content content = Content.getInstance();
        contentTA.setText(content.readContent());
    }

    private void saveInfoOnTA(){
        String content = contentTA.getText();
        FileUtils.save(content, "src/main/resources/com/example/safeproject/content.txt");
    }
}
