module com.example.framegenerator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.framegenerator to javafx.fxml;
    exports com.example.framegenerator;
}