module com.example.passwordmanager {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.fasterxml.jackson.databind;

    opens com.example.passwordmanager to javafx.fxml;

    exports com.example.passwordmanager;

}
