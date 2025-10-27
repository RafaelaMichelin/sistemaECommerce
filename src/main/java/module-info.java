module br.edu.unicesumar {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
   
    requires jakarta.persistence;
    requires org.hibernate.orm.core;
    requires java.sql;


    opens br.edu.unicesumar.sistemaECommerce to javafx.fxml;
    opens br.edu.unicesumar.sistemaECommerce.model to javafx.fxml, jakarta.persistence, org.hibernate.orm .core;
    exports br.edu.unicesumar.sistemaECommerce;
}