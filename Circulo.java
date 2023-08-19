package FigurasGeometricas;

public class Circulo {
	public double radio;
	public Circulo(double radio) {
	this.radio = radio;

	}
	public double calculaAreaCirculo() {
	return Math.PI* (radio*radio); 
	}
	public double calcularCircunferencia() {
	return (Math.PI*2)*radio;
	}

	public Circulo() {
		this (169599);
	}
	public double obtenerRadio() {
		return radio;
	}
}
