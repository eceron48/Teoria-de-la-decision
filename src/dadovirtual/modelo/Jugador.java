package dadovirtual.modelo;

public class Jugador implements Jugadas{
	
private double efectivo;
private double valorTirada;
private double riesgoCalculado;
private double ganancia;

 public void  iniciar() {
	 ganancia=0;
	 riesgoCalculado=0;
	 
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

public void prueba() {
	
}

@Override
public void irPorTodo() {
	// TODO Auto-generated method stub
	
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
	ganancia=efectivo;
	
}
 


}
