package dadovirtual.modelo;

public class IA implements Jugadas {
	private double tirarIA;
	private double ganancia;
	private int numIA;
	
	public IA() {
		
	}
	
public void iniciar() {
	tirarIA=0;
	ganancia=0;
	numIA=0;
}
	public double getTirarIA() {
		return tirarIA;
	}


	public void setTirarIA(double tirarIA) {
		this.tirarIA = tirarIA;
	}


	public int getNumIA() {
		return numIA;
	}


	public void setNumIA(int numIA) {
		this.numIA = numIA;
	}


	
	
	
	public double getGanancia() {
		return ganancia;
	}
	public void setGanancia(double ganancia) {
		this.ganancia = ganancia;
	}
	@Override
	public void tirar() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void ganancia() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean irPorTodo(double apuestaSobreLaMesa, double efectivo, int numJugador, int numIA) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void estadoDeGanancia() {
	
		this.ganancia=-tirarIA;
	}

	@Override
	public void evaluarJugadas( int tiradaIA, double tirada) {
		
		if (tiradaIA<2) {
			this.quitarJugada(tirada);
		}

		if (tiradaIA==6) {
			
			this.sumarJugada(tirada);
		
	}
	
	}

	@Override
	public void sumarJugada(double tirada) {
		this.ganancia=ganancia+tirada;
		
	}

	@Override
	public void quitarJugada(double tirada) {
		this.ganancia=this.ganancia-tirada;
		
	}

	@Override
	public boolean RiesgoCalculado(int numeroIA, int numeroJugador) {
		// TODO Auto-generated method stub
		return false;
	}

}
