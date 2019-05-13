package dadovirtual.modelo;

import javafx.scene.image.Image;

public class GifIA {
public Image imagenIA;
	
	public Image gifIA(int DadoIA) {
	switch (DadoIA)
	{
	
	case 1:
		imagenIA=new Image("dadovirtual\\imagen\\gif\\dados-01.gif");
		break;
	
	case 2:
		imagenIA=new Image("dadovirtual\\imagen\\gif\\dados-02.gif");
		break;
	case 3:
		imagenIA=new Image("dadovirtual\\imagen\\gif\\dados-03.gif");
		break;
	case 4:
		imagenIA=new Image("dadovirtual\\imagen\\gif\\dados-04.gif");
		break;
	case 5:
		imagenIA=new Image("dadovirtual\\imagen\\gif\\dados-05.gif");
		break;
	case 6:
		imagenIA=new Image("dadovirtual\\imagen\\gif\\dados-06.gif");
		break;
	
	}
		
	return imagenIA;	
	}
	

}
