module source.fsoffice {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens source.fsoffice to javafx.fxml;
    exports source.fsoffice;
}