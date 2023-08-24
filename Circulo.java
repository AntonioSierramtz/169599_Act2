package FigurasGeometricas;

public class Circulo {
	public double radio;
	public Circulo() {
		this (1695.99);
	}
	public Circulo(double radio) {
	this.radio = radio;
	}
	public double calculaAreaCirculo() {
	return Math.PI* (radio*radio); 
	}
	public double calcularCircunferencia() {
	 return lado * Math.sqrt(2);
	}
	public double obtenerRadio() {
		return radio;
	}
}
