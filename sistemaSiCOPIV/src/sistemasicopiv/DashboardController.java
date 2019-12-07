/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemasicopiv;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

/**
 * FXML Controller class
 *
 * @author Alejandro Llanganate
 */
public class DashboardController implements Initializable {

    @FXML
    private BorderPane borderPane;
    @FXML
    private Pane menuPane;
    @FXML
    private HBox hboxLogo;
    @FXML
    private HBox opcionInicio;
    @FXML
    private HBox opcionVentas;
    @FXML
    private HBox subMenuVentas;
    @FXML
    private HBox opcionMateriales;
    @FXML
    private HBox subMenuMateriales;
    @FXML
    private HBox opcionModelos;
    @FXML
    private HBox subMenuModelos;
    @FXML
    private HBox opcionClientes;
    @FXML
    private HBox subMenuClientes;
    @FXML
    private HBox opcionCuentas;
    @FXML
    private HBox subMenuCuentas;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        quitarVisibilidad_SubMenuVentas();
        quitarVisibilidad_SubMenuMateriales();
        quitarVisibilidad_SubMenuModelos();
        quitarVisibilidad_SubMenuClientes();
        quitarVisibilidad_SubMenuCuentas();

    }

    public void quitarVisibilidad_SubMenuVentas() {
        subMenuVentas.setVisible(false);
        subMenuVentas.setManaged(false);
        opcionVentas.setStyle("-fx-background-color: transparent ;-fx-border-width: 0 0 0 0;");
    }

    public void habilitarEstilo_OpcionInicio() {
        opcionInicio.setStyle(" -fx-background-color: #207091;\n" + "    -fx-border-width: 0 0 0 4; -fx-border-color: white white white white;");
    }

    public void quitarVisibilidad_OpcionInicio() {
        opcionInicio.setStyle(" -fx-background-color: transparent  ;  -fx-border-width: 0 0 0 0; ");
    }

    public void habilitarVisibilidad_SubMenuVentas() {
        subMenuVentas.setVisible(true);
        subMenuVentas.setManaged(true);
        opcionVentas.setStyle("-fx-background-color: #207091;-fx-border-width: 0 0 0 4; -fx-border-color: white white white white;");
    }

    public void quitarVisibilidad_SubMenuMateriales() {
        subMenuMateriales.setVisible(false);
        subMenuMateriales.setManaged(false);
        opcionMateriales.setStyle("-fx-background-color: transparent ;-fx-border-width: 0 0 0 0;");
    }

    public void habilitarVisibilidad_SubMenuMateriales() {
        subMenuMateriales.setVisible(true);
        subMenuMateriales.setManaged(true);
        opcionMateriales.setStyle("-fx-background-color: #207091;-fx-border-width: 0 0 0 4; -fx-border-color: white white white white;");
    }

    public void quitarVisibilidad_SubMenuModelos() {
        subMenuModelos.setVisible(false);
        subMenuModelos.setManaged(false);
        opcionModelos.setStyle("-fx-background-color: transparent ;-fx-border-width: 0 0 0 0;");
    }

    public void habilitarVisibilidad_SubMenuModelos() {
        subMenuModelos.setVisible(true);
        subMenuModelos.setManaged(true);
        opcionModelos.setStyle("-fx-background-color: #207091;-fx-border-width: 0 0 0 4; -fx-border-color: white white white white;");
    }

    public void quitarVisibilidad_SubMenuClientes() {
        subMenuClientes.setVisible(false);
        subMenuClientes.setManaged(false);
        opcionClientes.setStyle("-fx-background-color: transparent ;-fx-border-width: 0 0 0 0;");
    }

    public void habilitarVisibilidad_SubMenuClientes() {
        subMenuClientes.setVisible(true);
        subMenuClientes.setManaged(true);
        opcionClientes.setStyle("-fx-background-color: #207091;-fx-border-width: 0 0 0 4; -fx-border-color: white white white white;");
    }

    public void quitarVisibilidad_SubMenuCuentas() {
        subMenuCuentas.setVisible(false);
        subMenuCuentas.setManaged(false);
        opcionCuentas.setStyle("-fx-background-color: transparent ;-fx-border-width: 0 0 0 0;");
    }

    public void habilitarVisibilidad_SubMenuCuentas() {
        subMenuCuentas.setVisible(true);
        subMenuCuentas.setManaged(true);
        opcionCuentas.setStyle("-fx-background-color: #207091;-fx-border-width: 0 0 0 4; -fx-border-color: white white white white;");
    }

    @FXML
    private void abrirSubmenuVentas(MouseEvent event) {
        habilitarVisibilidad_SubMenuVentas();
        quitarVisibilidad_OpcionInicio();
        quitarVisibilidad_SubMenuMateriales();
        quitarVisibilidad_SubMenuModelos();
        quitarVisibilidad_SubMenuClientes();
        quitarVisibilidad_SubMenuClientes();
        quitarVisibilidad_SubMenuCuentas();
    }

    @FXML
    private void abrirInicio(MouseEvent event) {
        habilitarEstilo_OpcionInicio();
        quitarVisibilidad_SubMenuVentas();
        quitarVisibilidad_SubMenuMateriales();
        quitarVisibilidad_SubMenuModelos();
        quitarVisibilidad_SubMenuClientes();
        quitarVisibilidad_SubMenuCuentas();

    }

    @FXML
    private void abrirSubmenuMateriales(MouseEvent event) {
        habilitarVisibilidad_SubMenuMateriales();
        quitarVisibilidad_OpcionInicio();
        quitarVisibilidad_SubMenuVentas();
        quitarVisibilidad_SubMenuModelos();
        quitarVisibilidad_SubMenuClientes();
        quitarVisibilidad_SubMenuCuentas();
    }

    @FXML
    private void abrirSubmenuModelos(MouseEvent event) {
        habilitarVisibilidad_SubMenuModelos();
        quitarVisibilidad_OpcionInicio();
        quitarVisibilidad_SubMenuVentas();
        quitarVisibilidad_SubMenuMateriales();
        quitarVisibilidad_SubMenuClientes();
        quitarVisibilidad_SubMenuCuentas();

    }

    @FXML
    private void abrirSubmenuClientes(MouseEvent event) {
        habilitarVisibilidad_SubMenuClientes();
        quitarVisibilidad_OpcionInicio();
        quitarVisibilidad_SubMenuVentas();
        quitarVisibilidad_SubMenuMateriales();
        quitarVisibilidad_SubMenuModelos();
        quitarVisibilidad_SubMenuCuentas();
    
    }

    @FXML
    private void abrirSubmenuCuentas(MouseEvent event) {
        habilitarVisibilidad_SubMenuCuentas();
        quitarVisibilidad_OpcionInicio();
        quitarVisibilidad_SubMenuVentas();
        quitarVisibilidad_SubMenuMateriales();
        quitarVisibilidad_SubMenuModelos();
        quitarVisibilidad_SubMenuClientes();

        
    }

}
