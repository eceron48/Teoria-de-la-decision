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


	@Override
	public void irPorTodo() {
		// TODO Auto-generated method stub
		
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
	public void RiesgoCalculado() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ganancia() {
		// TODO Auto-generated method stub
		
	}

}
