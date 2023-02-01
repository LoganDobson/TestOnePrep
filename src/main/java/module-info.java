module com.example.testoneprep {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.testoneprep to javafx.fxml;
    exports com.example.testoneprep;
}