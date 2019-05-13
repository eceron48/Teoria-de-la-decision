package dadovirtual.modelo;

import javafx.scene.image.Image;

public class ResultadoImagen {

	
	public Image imagen;
	
	public Image gifJugadorR(int DadoR) {
	switch (DadoR)
	{
	
	case 1:
		imagen=new Image("dadovirtual\\imagen\\png\\1.png");
		break;
	
	case 2:
		imagen=new Image("dadovirtual\\imagen\\png\\2.png");
		break;
	case 3:
		imagen=new Image("dadovirtual\\imagen\\png\\3.png");
		break;
	case 4:
		imagen=new Image("dadovirtual\\imagen\\png\\4.png");
		break;
	case 5:
		imagen=new Image("dadovirtual\\imagen\\png\\5.png");
		break;
	case 6:
		imagen=new Image("dadovirtual\\imagen\\png\\6.png");
		break;
	
	}
		
	return imagen;	
	}
	
}
