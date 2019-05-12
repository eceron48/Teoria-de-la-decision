package dadovirtual.modelo;
import javax.swing.ImageIcon;

import javafx.scene.image.Image;

public class Imagenes {
	public Image imagen;
	
	public Image gifJugador(int Dado1) {
	switch (Dado1)
	{
	
	case 1:
		imagen=new Image("dadovirtual\\imagen\\gif\\dados-01.gif");
	
	case 2:
		imagen=new Image("dadovirtual\\imagen\\gif\\dados-02.gif");
	case 3:
		imagen=new Image("dadovirtual\\imagen\\gif\\dados-03.gif");
	case 4:
		imagen=new Image("dadovirtual\\imagen\\gif\\dados-04.gif");
	case 5:
		imagen=new Image("dadovirtual\\imagen\\gif\\dados-05.gif");
	case 6:
		imagen=new Image("dadovirtual\\imagen\\gif\\dados-06.gif");
	
	}
		
	return imagen;	
	}
	

}
