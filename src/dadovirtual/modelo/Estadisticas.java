package dadovirtual.modelo;

public interface Estadisticas {
	
	public double apuestaSobreLaMesa(double tiradaJugador,double tiradaIA);
	
	public void sumarTirada(double tirada) ;
	public void quitarTirada(double tirada) ;
	
	public void evaluarTurnos(int tiradaJugador, int tiradaIA, double valorTirada) ;
	
		
	
}


