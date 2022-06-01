module com.example.ricochetrobot {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ricochetrobot to javafx.fxml;
    exports com.example.ricochetrobot;
}