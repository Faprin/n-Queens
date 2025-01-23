module com.example.problemareinas {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    // Exportar los paquetes necesarios
    exports com.Algoritmos.Model;
    exports com.Algoritmos.Controller;

    // Abrir los paquetes a JavaFX para permitir reflexión
    opens com.Algoritmos.Controller to javafx.fxml;
    opens com.Algoritmos.Model.consoleApp to javafx.fxml;
}
