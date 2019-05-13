package dadovirtual.controlador;



import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import dadovirtual.modelo.Dado;
import dadovirtual.modelo.GifIA;
import dadovirtual.modelo.Imagenes;
import dadovirtual.modelo.Jugador;
import dadovirtual.modelo.ResultadoIA;
import dadovirtual.modelo.ResultadoImagen;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class ControladorDado  implements Initializable{
	Jugador player=new Jugador();
	
 	
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
    


	@FXML
    void empezar(ActionEvent event) {
		
	
		if (valorMaximotx.getText().isEmpty() ||valorTiradatx.getText().isEmpty() ) {
			JOptionPane.showMessageDialog(null, "debe llenar los campos valor máximo de apuesta y valor tirada  ",null, 1);
		}
		else {
		
		player.setEfectivo(Double.parseDouble(valorMaximotx.getText()));;
		player.setValorTirada(Double.parseDouble(valorTiradatx.getText()));
		player.setValorTirada(Double.valueOf(valorTiradatx.getText()));
		valorTiradatx.setEditable(false);
		valorMaximotx.setEditable(false);
		}
		
		
		
		valorRiesgotx.setText("");
		txtnumJugador.setText("");
		txtnumIA.setText("");
		txttotalMesa.setText("");
		gananciaIAtx.setText("");
		gananciatx.setText("");
	
	

    }

    @FXML
    void parar(ActionEvent event) {
    	Dado d=new Dado();
    	int dado=d.calcularNumero();
    	ResultadoImagen RI=new ResultadoImagen();
     	imbimg1.setImage(RI.gifJugadorR(dado));
    	txtnumJugador.setText(String.valueOf(dado));
   
    	
    	
			int s=d.calcularNumero();
			 ResultadoIA Gif=new ResultadoIA();
			 imbimg2.setImage(Gif.gifIAR(s));
			txtnumIA.setText(String.valueOf(s));
			
		
    	

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
    	
  
    	
			 GifIA Gif=new GifIA();
			 Dado da=new Dado();
			 int s=da.calcularNumero();
			imbimg2.setImage(Gif.gifIA(s));
			
		
    	

   
    	
    	// txttotalMesa.setText(String.valueOf(id));
    	
    	

    }
    @FXML
    void rendirse(ActionEvent event) {
    	player.iniciar();
    	txtnumJugador.setText("");
		valorRiesgotx.setText("");
		txtnumJugador.setText("");
		txtnumIA.setText("");
		txttotalMesa.setText("");
		gananciaIAtx.setText("");
		gananciatx.setText("");
		txtnumIA.setText("");
	

    }
	
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	

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
    void soloNumerosMaximo(KeyEvent event) {
	 	char c=event.getCharacter().charAt(0);
	 	if( Character.isLetter(c)) {
	 		event.consume();
	 	}
    }

    @FXML
    void soloNumerosTirar(KeyEvent event) {
    	char c=event.getCharacter().charAt(0);
	 	if( Character.isLetter(c)) {
	 		event.consume();
	 	}
    }
    
}
