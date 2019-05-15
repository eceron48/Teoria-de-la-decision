package dadovirtual.controlador;



import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import dadovirtual.modelo.Dado;
import dadovirtual.modelo.GifIA;
import dadovirtual.modelo.IA;
import dadovirtual.modelo.Imagenes;
import dadovirtual.modelo.Jugador;
import dadovirtual.modelo.Mesa;
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
	IA iaplayer=new IA();
	Mesa mesa =new Mesa();
	boolean portodo=false;
	
 	
	public boolean isPortodo() {
		return portodo;
	}

	public void setPortodo(boolean portodo) {
		this.portodo = portodo;
	}

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
    private TextField txtmesa;
    
   
	@FXML
    void empezar(ActionEvent event) {
		
	
		if (valorMaximotx.getText().isEmpty() ||valorTiradatx.getText().isEmpty() ) {
			
			JOptionPane.showMessageDialog(null, "debe llenar los campos valor máximo de apuesta y valor tirada  ",null, 1);
		}
		else {
			
		
		player.setEfectivo(Double.parseDouble(valorMaximotx.getText()));
		player.setValorTirada(Double.parseDouble(valorTiradatx.getText()));	
		iaplayer.setTirarIA(Double.parseDouble(valorTiradatx.getText()));
		
		if(player.getEfectivo()<player.getValorTirada()) {
			JOptionPane.showMessageDialog(null, "el valor de la apuesta no debe exeder el valor maximo de la apuesta",null, 2);
			player.iniciar();
	    	iaplayer.iniciar();
	    	valorTiradatx.setText("");
	    	 valorMaximotx.setText("");
			
		}else {
			valorTiradatx.setEditable(true);
			valorMaximotx.setEditable(true);
			btntirar.setDisable(false);
			btnparar.setDisable(false);
			btnportodo.setDisable(false);
			valorRiesgotx.setEditable(true);
			btnriesgo.setDisable(false);
			btnportodo.setDisable(false);
			player.ganancia();
			
			player.estadoDeGanancia();
			
			iaplayer.estadoDeGanancia();
			
			mesa.apuestaSobreLaMesa(player.getValorTirada(), iaplayer.getTirarIA());
			txtmesa.setText(String.valueOf(mesa.getApuesta()) );
			gananciaIAtx.setText(String.valueOf(iaplayer.getGanancia()) );
			gananciatx.setText(String.valueOf(player.getGanancia()) );
			
			
		}
		
		
		}
		
		
		
		
	
	

    }

    @FXML
    void parar(ActionEvent event) {
    	
    	if(mesa.getApuesta()>0 && player.getGanancia()>player.getValorTirada()) {
    	Dado d=new Dado();
    	int dado=d.calcularNumero();
    	ResultadoImagen RI=new ResultadoImagen();
     	imbimg1.setImage(RI.gifJugadorR(dado));
    	txtnumJugador.setText(String.valueOf(dado));
   
    	
    	
			int s=d.calcularNumero();
			 ResultadoIA Gif=new ResultadoIA();
			 imbimg2.setImage(Gif.gifIAR(s));
			txtnumIA.setText(String.valueOf(s));
			
		mesa.evaluarTurnos(dado, s, player.getValorTirada());	
		
		player.evaluarJugadas(dado, player.getValorTirada());
		
		iaplayer.evaluarJugadas(s, player.getValorTirada());
		
		txtmesa.setText(String.valueOf(mesa.getApuesta()) );
		gananciatx.setText(String.valueOf(player.getGanancia()));
		gananciaIAtx.setText(String.valueOf(iaplayer.getGanancia()));
    	}
    	else {
    		if(player.getGanancia()>player.getEfectivo()) {
    			double ganador=player.getGanancia()-player.getEfectivo();
    			JOptionPane.showMessageDialog(null, " el juego ha terminado juego terminado usted gano ="+ganador,null, 1);
    			this.rendirse(event);
    			
    		}else {
    			double perdedor=player.getEfectivo()-player.getGanancia();
    			JOptionPane.showMessageDialog(null, " el juego ha terminado lamentablemente has perdido  ="+perdedor,null, 2);	
    			this.rendirse(event);
    		}
    	
    	
    		
    	}

    }

    @FXML
    void portodo(ActionEvent event) {
    	
 
    	if( mesa.getApuesta()<=player.getGanancia()) {
        	Dado d=new Dado();
        	int dado=d.calcularNumero();
        	ResultadoImagen RI=new ResultadoImagen();
         	imbimg1.setImage(RI.gifJugadorR(dado));
        	txtnumJugador.setText(String.valueOf(dado));
        	player.setNumJugador(Integer.parseInt(txtnumJugador.getText()));
       
        
        	
    			int s=d.calcularNumero();
    			 ResultadoIA Gif=new ResultadoIA();
    			 imbimg2.setImage(Gif.gifIAR(s));
    			txtnumIA.setText(String.valueOf(s));
    			iaplayer.setNumIA(Integer.parseInt(txtnumIA.getText()));
    			this.portodo=true;
    			
    			this.validarResultadoTodo(portodo, event);
    	
    	} else {
        	 JOptionPane.showMessageDialog(null, "eres pobre no puedes apostar todo",null,1);	
        	}

    }

    
    public void validarResultadoTodo(boolean rest, ActionEvent event) {
		
 	   if( (player.irPorTodo(mesa.getApuesta(), player.getGanancia(), player.getNumJugador(), iaplayer.getNumIA()))==false) {
 		   
 		   JOptionPane.showMessageDialog(null, "Gana la casa !!!! ="+mesa.getApuesta()+"$  jugada IA= "+iaplayer.getNumIA()+" vs jugador = "+player.getNumJugador(),null,1);   
 		  this.rendirse(event);
 		   
 	   }else {
 		double  ganar= (player.getGanancia()+ mesa.getApuesta()) -player.getEfectivo();
 		
 			JOptionPane.showMessageDialog(null, "Ganaste !!!! un total de = "+ganar,null,1);
 			this.rendirse(event);
 	   }
 	    
   
 	
    	
    }
    @FXML
    void riesgo(ActionEvent event) {
    	
    	player.setRiesgoCalculado(Double.valueOf(valorRiesgotx.getText()));
    	
    	if( (mesa.getApuesta()>player.getRiesgoCalculado()) && ( player.getGanancia()>player.getRiesgoCalculado())) {
        	Dado d=new Dado();
        	int dado=d.calcularNumero();
        	ResultadoImagen RI=new ResultadoImagen();
         	imbimg1.setImage(RI.gifJugadorR(dado));
        	txtnumJugador.setText(String.valueOf(dado));
        	player.setNumJugador(Integer.parseInt(txtnumJugador.getText()));
       
        	
        	
    			int s=d.calcularNumero();
    			 ResultadoIA Gif=new ResultadoIA();
    			 imbimg2.setImage(Gif.gifIAR(s));
    			txtnumIA.setText(String.valueOf(s));
    			iaplayer.setNumIA(Integer.parseInt(txtnumIA.getText()));
    			
    			if(player.RiesgoCalculado(s, dado)) {
    				player.sumarJugada(player.getRiesgoCalculado());
    				mesa.quitarTirada(player.getRiesgoCalculado());
    			}else{
    				player.quitarJugada(player.getRiesgoCalculado());
    				mesa.sumarTirada(player.getRiesgoCalculado());
    			}
    			
    			
   
    }else {
    	JOptionPane.showMessageDialog(null, "no se puede permitir esa apuesta es muy alta ",null,1);
    	valorRiesgotx.setText("");
    	
    }
    	
    	txtmesa.setText(String.valueOf(mesa.getApuesta()) );
		gananciatx.setText(String.valueOf(player.getGanancia()));
		gananciaIAtx.setText(String.valueOf(iaplayer.getGanancia()));
		
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
			
		
    	

   
    	
    
    	
    	

    }
    @FXML
    void rendirse(ActionEvent event) {
    	imbimg1.setImage(null);
    	imbimg2.setImage(null);
    	mesa.iniciar();
    	player.iniciar();
    	iaplayer.iniciar();
    	valorTiradatx.setText("");
    	 valorMaximotx.setText("");
    	txtnumJugador.setText("");
		valorRiesgotx.setText("");
		txtnumJugador.setText("");
		txtnumIA.setText("");
		txtmesa.setText("");
		gananciaIAtx.setText("");
		gananciatx.setText("");
		txtnumIA.setText("");
		btntirar.setDisable(true);
		btnportodo.setDisable(true);
		btnparar.setDisable(true);
		valorRiesgotx.setEditable(false);
		btnriesgo.setDisable(true);
		
	

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

	public Button getBtnrendirse() {
		return btnrendirse;
	}

	public void setBtnrendirse(Button btnrendirse) {
		this.btnrendirse = btnrendirse;
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
