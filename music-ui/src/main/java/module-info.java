module com.maria.zlateva.musicui {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires java.sql;

//    requires org.controlsfx.controls;
//    requires com.dlsc.formsfx;
//    requires net.synedra.validatorfx;
//    requires org.kordamp.ikonli.javafx;
//    requires org.kordamp.bootstrapfx.core;
//    requires eu.hansolo.tilesfx;
//    requires com.almasb.fxgl.all;
//
//    requires eu.hansolo.fx.countries;
//    requires eu.hansolo.fx.heatmap;
//    requires eu.hansolo.toolboxfx;
//    requires eu.hansolo.toolbox;

    opens com.maria.zlateva.musicui to javafx.fxml;
    opens com.maria.zlateva.musicui.model;
    exports com.maria.zlateva.musicui;
}