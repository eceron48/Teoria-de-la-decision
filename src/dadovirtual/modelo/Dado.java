package dadovirtual.modelo;

import java.util.Random;

public class Dado implements AccionesDado {
	
private int Tirar;
private int calcularNumero;

	
	public int getTirar() {
	return Tirar;
}

public void setTirar(int tirar) {
	Tirar = tirar;
}

public int getCalcularNumero() {
	return calcularNumero;
}

public void setCalcularNumero(int calcularNumero) {
	this.calcularNumero = calcularNumero;
}

	public Dado() {
	
	}

	@Override
	public int calcularNumero() {
		Random generar=new Random(System.nanoTime());
		Tirar=generar.nextInt(6)+1;
		return Tirar;
	}

	
	
	



	

}
