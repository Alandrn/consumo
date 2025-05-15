module fx.tablero {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires java.desktop;

    opens fx.tablero to javafx.fxml;
    exports fx.tablero;
}