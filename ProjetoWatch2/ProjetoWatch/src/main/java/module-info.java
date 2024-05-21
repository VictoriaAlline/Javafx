module com.group.projetowatch {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
            
    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    opens com.group.projetowatch to javafx.fxml;
    exports com.group.projetowatch;
}