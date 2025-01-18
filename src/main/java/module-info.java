module com.example.problemareinas {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.problemareinas to javafx.fxml;
    exports com.example.problemareinas;
}