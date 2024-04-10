package co.edu.uniquindio.pizzeria.viewController;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

public class mainController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button buttonSolicitarPedido;

    @FXML
    private ListView<?> listProductos;

    @FXML
    private Tab tabAdmin;

    @FXML
    private Tab tabAdmin1;

    @FXML
    private Tab tabUser;

    @FXML
    private TableColumn<?, ?> tableCantidad;

    @FXML
    private TableColumn<?, ?> tableInfo;

    @FXML
    private TableView<?> tablePedido;

    @FXML
    private TableColumn<?, ?> tablePrecio;

    @FXML
    private TableColumn<?, ?> tableProducto;

    @FXML
    private TextArea txtPedido;

    @FXML
    void initialize() {
        assert buttonSolicitarPedido != null : "fx:id=\"buttonSolicitarPedido\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert listProductos != null : "fx:id=\"listProductos\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert tabAdmin != null : "fx:id=\"tabAdmin\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert tabAdmin1 != null : "fx:id=\"tabAdmin1\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert tabUser != null : "fx:id=\"tabUser\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert tableCantidad != null : "fx:id=\"tableCantidad\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert tableInfo != null : "fx:id=\"tableInfo\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert tablePedido != null : "fx:id=\"tablePedido\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert tablePrecio != null : "fx:id=\"tablePrecio\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert tableProducto != null : "fx:id=\"tableProducto\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert txtPedido != null : "fx:id=\"txtPedido\" was not injected: check your FXML file 'hello-view.fxml'.";

    }

}
