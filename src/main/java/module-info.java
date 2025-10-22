module br.edu.unicesumar {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    opens br.edu.unicesumar.sistemaECommerce to javafx.fxml;
    exports br.edu.unicesumar.sistemaECommerce;
}