module com.example.parcialcorte2 {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.parcialcorte2 to javafx.fxml;
    exports com.example.parcialcorte2;
    opens com.example.parcialcorte2.controller to javafx.fxml;
    exports com.example.parcialcorte2.controller;
}