module fx.pastelpoo {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires java.desktop;

    opens fx.pastelpoo to javafx.fxml;
    exports fx.pastelpoo;
}