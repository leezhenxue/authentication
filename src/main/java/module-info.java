module com.example.authentication {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.authentication to javafx.fxml;
    exports com.example.authentication;
}