module com.example.problemareinas {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.Algoritmos to javafx.fxml;
    exports com.Algoritmos;
}