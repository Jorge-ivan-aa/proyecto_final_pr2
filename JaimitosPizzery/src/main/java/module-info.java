module co.edu.uniquindio.pizzeria {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    opens co.edu.uniquindio.pizzeria to javafx.fxml;
    exports co.edu.uniquindio.pizzeria;
}
