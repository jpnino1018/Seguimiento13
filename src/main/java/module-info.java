module com.example.safeproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.safeproject to javafx.fxml;
    exports com.example.safeproject;
    exports com.example.safeproject.control;
    opens com.example.safeproject.control to javafx.fxml;
}