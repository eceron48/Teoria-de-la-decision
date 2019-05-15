package dadovirtual.modelo;

public interface Jugadas {
	
	public boolean irPorTodo(double apuestaSobreLaMesa, double efectivo,int numJugador,int numIA);
	public void tirar();
	public boolean RiesgoCalculado(int numeroIA,int numeroJugador);
	public void ganancia();
	public void estadoDeGanancia() ;
	public void evaluarJugadas(int tiradaJugador, double tirada);
	public void sumarJugada(double tirada) ;
	public void quitarJugada(double tirada) ;
		
	
	

}
