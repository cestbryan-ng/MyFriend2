module javafxtest.testjavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires jdk.compiler;


    opens javafxtest.testjavafx to javafx.fxml;
    exports javafxtest.testjavafx;
}