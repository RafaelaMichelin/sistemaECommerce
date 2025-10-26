module br.edu.unicesumar {
    // Requisitos JavaFX
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    
    // REQUISITOS JPA / HIBERNATE (PARA RESOLVER O ERRO)
    // 1. Módulo JPA API (fornecido pela dependência jakarta.persistence-api)
    requires jakarta.persistence; 
    
    // 2. Módulo Hibernate Core (fornecido pela dependência hibernate-core)
    requires org.hibernate.orm.core; 

    // 3. Módulo do MariaDB (Obrigatório para drivers JDBC)
    requires java.sql; 
    requires org.mariadb.jdbc; 
    
    // Permissões
    opens br.edu.unicesumar.sistemaECommerce to javafx.fxml;
    exports br.edu.unicesumar.sistemaECommerce;
}