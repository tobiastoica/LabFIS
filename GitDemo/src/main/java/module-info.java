module com.example.gitdemo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.gitdemo to javafx.fxml;
    exports com.example.gitdemo;
}