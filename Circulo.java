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

	public double obtenerradioCirculo() {
        return 169599/100;
    }
	public double obtenerRadio() {
		return radio;
	}
}
