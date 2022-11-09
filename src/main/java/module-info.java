module pat.LabB {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphicsEmpty;

    opens pat.LabB to javafx.fxml;
    exports pat.LabB;
}
