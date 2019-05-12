package dadovirtual.controlador;



import java.net.URL;
import java.util.ResourceBundle;

import dadovirtual.modelo.Dado;
import dadovirtual.modelo.Imagenes;
import dadovirtual.modelo.Jugador;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class ControladorDado  implements Initializable{
	
	@FXML
    private Label lbimg1;
    @FXML
    private ImageView imbimg1;
	@FXML
    private ImageView imbimg2;
	
	@FXML
    private  Label lbimg2;
    @FXML
    private Button btnriesgo;

    @FXML
    private TextField valorRiesgotx;

    @FXML
    private Button btnportodo;

    @FXML
    private Button btntirar;

    @FXML
    private TextField valorMaximotx;

    @FXML
    private TextField valorTiradatx;

    @FXML
    private Button btninicio;

    @FXML
    private TextField totaltx;

    @FXML
    private TextField gananciatx;

    @FXML
    private TextField gananciaIAtx;

    @FXML
    private Button btnparar;

    @FXML
    private Pane panel1fx;
    @FXML
    private TextField txtnumJugador;
    @FXML
    private TextField txtnumIA;

    @FXML
    private Pane panel2fx;
    
    @FXML
    private Button btnrendirse;
    @FXML
    private TextField txttotalMesa;
    

    public Button getBtnriesgo() {
		return btnriesgo;
	}

	public void setBtnriesgo(Button btnriesgo) {
		this.btnriesgo = btnriesgo;
	}

	public TextField getValorRiesgotx() {
		return valorRiesgotx;
	}

	public void setValorRiesgotx(TextField valorRiesgotx) {
		this.valorRiesgotx = valorRiesgotx;
	}

	public Button getBtnportodo() {
		return btnportodo;
	}

	public void setBtnportodo(Button btnportodo) {
		this.btnportodo = btnportodo;
	}

	public Button getBtntirar() {
		return btntirar;
	}

	public void setBtntirar(Button btntirar) {
		this.btntirar = btntirar;
	}

	public TextField getValorMaximotx() {
		return valorMaximotx;
	}

	public void setValorMaximotx(TextField valorMaximotx) {
		this.valorMaximotx = valorMaximotx;
	}

	public TextField getValorTiradatx() {
		return valorTiradatx;
	}

	public void setValorTiradatx(TextField valorTiradatx) {
		this.valorTiradatx = valorTiradatx;
	}

	public Button getBtninicio() {
		return btninicio;
	}

	public void setBtninicio(Button btninicio) {
		this.btninicio = btninicio;
	}

	public TextField getTotaltx() {
		return totaltx;
	}

	public void setTotaltx(TextField totaltx) {
		this.totaltx = totaltx;
	}

	public TextField getGananciatx() {
		return gananciatx;
	}

	public void setGananciatx(TextField gananciatx) {
		this.gananciatx = gananciatx;
	}

	public TextField getGananciaIAtx() {
		return gananciaIAtx;
	}

	public void setGananciaIAtx(TextField gananciaIAtx) {
		this.gananciaIAtx = gananciaIAtx;
	}

	public Button getBtnparar() {
		return btnparar;
	}

	public void setBtnparar(Button btnparar) {
		this.btnparar = btnparar;
	}

	public Pane getPanel1fx() {
		return panel1fx;
	}

	public void setPanel1fx(Pane panel1fx) {
		this.panel1fx = panel1fx;
	}

	public Pane getPanel2fx() {
		return panel2fx;
	}

	public void setPanel2fx(Pane panel2fx) {
		this.panel2fx = panel2fx;
	}

	@FXML
    void empezar(ActionEvent event) {
		Jugador player=new Jugador();
		player.setEfectivo(Double.parseDouble(valorMaximotx.getText()));;
		player.setValorTirada(Double.parseDouble(valorTiradatx.getText()));
		valorTiradatx.getText();
		valorTiradatx.setEditable(false);
		valorMaximotx.setEditable(false);
		
	

    }

    @FXML
    void parar(ActionEvent event) {

    }

    @FXML
    void portodo(ActionEvent event) {

    }

    @FXML
    void riesgo(ActionEvent event) {

    }

    @FXML
    void tirar(ActionEvent event) {
    	Dado d=new Dado();
    	int dado=d.calcularNumero();
    	Imagenes dado1=new Imagenes();
    	
    	imbimg1.setImage(dado1.gifJugador(dado));
    	imbimg2.setImage(dado1.gifJugador(dado));
    	
  
    	
    	
    	

    }
    @FXML
    void rendirse(ActionEvent event) {

    }
	
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}
