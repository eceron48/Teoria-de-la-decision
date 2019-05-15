package dadovirtual.modelo;

import javax.swing.JOptionPane;

public class Jugador implements Jugadas{
	
private double efectivo;
private double valorTirada;
private double riesgoCalculado;
private double ganancia;
private int numJugador;

 public void  iniciar() {
	 ganancia=0;
	 riesgoCalculado=0;
	 efectivo=0;
	 valorTirada=0;
	 
 }
 public Jugador() {
	 
 }
 
 
 

public double getEfectivo() {
	return efectivo;
}
public void setEfectivo(double efectivo) {
	this.efectivo = efectivo;
}
public double getValorTirada() {
	return valorTirada;
}
public void setValorTirada(double valorTirada) {
	this.valorTirada = valorTirada;
}
public double getRiesgoCalculado() {
	return riesgoCalculado;
}
public void setRiesgoCalculado(double riesgoCalculado) {
	this.riesgoCalculado = riesgoCalculado;
}
public double getGanancia() {
	return ganancia;
}
public void setGanancia(double ganancia) {
	this.ganancia = ganancia;
}
public int getNumJugador() {
	return numJugador;
}
public void setNumJugador(int numJugador) {
	this.numJugador = numJugador;
}
public void prueba() {
	
}

@Override
public boolean irPorTodo(double apuestaSobreLaMesa, double efectivo,int numJugador,int numIA) {
	
	boolean decision=false;
{
		
		if(numJugador<numIA || numJugador<2) {
			
			
			decision=false;
			
		}else {
			
		
			decision=true;
			
		}
		
	}
	return decision;
}
@Override
public void tirar() {
	// TODO Auto-generated method stub
	
}

	
	
	
	


@Override
public void ganancia() {
	ganancia=efectivo;
	
	
}
@Override
public void estadoDeGanancia() {
	this.ganancia=this.ganancia-valorTirada;
	
}
@Override
public void evaluarJugadas(int tiradaJugador,double tirada) {
	if (tiradaJugador<2) {
		
		this.quitarJugada(tirada);
	}
	

	
	if (tiradaJugador==6) {
		this.sumarJugada(tirada);
		
	}	
}

@Override
public void sumarJugada(double tirada) {
	this.ganancia=this.ganancia+tirada;
	
}
@Override
public void quitarJugada(double tirada) {
	this.ganancia=this.ganancia-tirada;
	if(this.ganancia<1) {
		this.iniciar();
			
	}
	
}
@Override
public boolean RiesgoCalculado(int numeroIA, int numeroJugador) {
	boolean resp=false;
	if (numeroJugador<numeroIA && numeroJugador>2) {
		resp=true; 
	}else {
		resp=false;
		
	}
	
	return resp;
}



}
