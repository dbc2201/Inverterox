module io.dbc.github.inverterox {
    requires javafx.controls;
    requires javafx.fxml;


    opens io.dbc.github.inverterox to javafx.fxml;
    exports io.dbc.github.inverterox;
}