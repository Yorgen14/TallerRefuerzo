import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import java.util.ArrayList;

public class Veterinario {

    @FXML
    private Button btnagregar;

    @FXML
    private Button btnmostrar;

    @FXML
    private Button btnsalir;

    @FXML
    private Label lbledad;

    @FXML
    private Label lblespecie;

    @FXML
    private Label lblnombre;

    @FXML
    private Label lblraza;

    @FXML
    private TextField txtedad;

    @FXML
    private TextField txtespecie;

    @FXML
    private TextArea txtmascotas;

    @FXML
    private TextField txtnombre;

    @FXML
    private TextField txtraza;
 veterinaria veterinaria = new veterinaria();
    @FXML
    void agregar(ActionEvent event) {
            
            String nombre = txtnombre.getText();
            String especie = txtespecie.getText();
            int edad = Integer.parseInt(txtedad.getText());
            String raza = txtraza.getText();
            
            Mascota nuevaMascota = new Mascota();
            nuevaMascota.setNombre(nombre);
            nuevaMascota.setEspecie(especie);
            nuevaMascota.setEdad(edad);
            nuevaMascota.setRaza(raza);

            veterinaria.agregarMascota(nuevaMascota);
    }

    @FXML
    void mostrar(ActionEvent event) {
        
    ArrayList<Mascota> mascotas = veterinaria.obtenerMascotas();
        if (mascotas.isEmpty()) {
            txtmascotas.setText("No hay mascotas registradas.");
        } else {
            StringBuilder mascotasInfo = new StringBuilder();
            for (Mascota mascota : mascotas) {
                mascotasInfo.append(mascota).append("\n");
            }
            txtmascotas.setText(mascotasInfo.toString());
        }
    }

    @FXML
    void salir(ActionEvent event) {

    }

}
