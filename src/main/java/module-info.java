module com.example.pr3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pr3 to javafx.fxml;
    exports com.example.pr3;
}