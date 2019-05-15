package dadovirtual.modelo;

import javax.swing.JOptionPane;

import dadovirtual.controlador.ControladorDado;

public class Mesa  implements Estadisticas{
	 private double apuesta;
	 
	 public Mesa() {
		 
	 }
	 
	 public void iniciar() {
		 
		 apuesta=0;
	 }

	public double getApuesta() {
		return apuesta;
	}

	public void setApuesta(double apuesta) {
		this.apuesta = apuesta;
	}
	 
	 
	public double apuestaSobreLaMesa(double tiradaJugador,double tiradaIA) {
		
		return this.apuesta=tiradaJugador+tiradaIA;
		
	}

	@Override
	public void sumarTirada(double tirada) {
			this.apuesta=this.apuesta+tirada;
		
	}


		
		
		
	

	@Override
	public void quitarTirada(double tirada) {
		
		this.apuesta=this.apuesta-tirada;
		if(this.apuesta<1) {
			this.iniciar();
				
		}
		
	}

	@Override
	public void evaluarTurnos(int tiradaJugador, int tiradaIA, double valorTirada) {
		
		if (tiradaJugador<2) {
			this.sumarTirada(valorTirada);
		}
		
		if (tiradaIA<2) {
			this.sumarTirada(valorTirada);
		}
	
		if (tiradaIA==6) {
			this.quitarTirada(valorTirada);;
		}
		if (tiradaJugador==6) {
			this.quitarTirada(valorTirada);
		}
		
	}
	



}
