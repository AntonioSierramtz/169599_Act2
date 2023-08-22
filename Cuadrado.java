package FigurasGeometricas;

public class Cuadrado {
	public double lado;
	public Cuadrado() {
		this (1695.99);
	}
	public Cuadrado(double lado) {
	this.lado = lado;

	}
	public double obtenerLado1() {
		return lado;
	}
	public double calculaArea() {
	return (lado*lado); 
	}
	public double calcularPeri() {
	return (lado+lado+lado+lado);	
	}
	public double calculaDiagonal() {
        return Math.sqrt(2) * lado;
    }
	
	}
	


