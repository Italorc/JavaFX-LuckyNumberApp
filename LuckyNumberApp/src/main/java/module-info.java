module com.example.luckynumberapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.luckynumberapp to javafx.fxml;
    exports com.example.luckynumberapp;
}