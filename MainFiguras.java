package FigurasGeometricas;
import java.util.Scanner;

public class MainFiguras {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        while (true) {
            System.out.println("Menu: \n Para el cuadrado ingrese 1 : \n Para el circulo ingrese 2: ");
            String entrada = in.nextLine();
            double menu = Double.parseDouble(entrada);

            if (menu == 1) {
                Cuadrado cuadrado1 = new Cuadrado(23);
                System.out.print("Usted seleccionó el cuadrado \n");
                System.out.println("El lado asignado es: " + cuadrado1.obtenerLado1());
                System.out.println("Area del cuadrado: " + cuadrado1.calculaArea());
                System.out.println("Diagonal del cuadrado: " + cuadrado1.calculaDiagonal());
                System.out.println("Perímetro del cuadrado: " + cuadrado1.calcularPeri());
                System.out.println("El lado asignado del ID es: " + cuadrado1.obtenerLado());
                break; 
            } else if (menu == 2) {
                Circulo circulo1 = new Circulo(16);
                System.out.print("Usted seleccionó el circulo \n");
                System.out.println("Radio del circulo: " + circulo1.obtenerRadio());
                System.out.println("Area del Circulo: " + circulo1.calculaAreaCirculo());
                System.out.println("Circunferencia del Circulo: " + circulo1.calcularCircunferencia());
                System.out.println("El radio asignado del ID es: " + circulo1.obtenerradioCirculo());
                break; 
            } else {
                System.out.println("Número incorrecto, no selecciono ninguna opción valida intentelo de nuevo.");
            }
        }
    }
}
