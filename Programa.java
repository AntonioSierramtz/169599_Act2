package FigurasGeometricas;

import java.util.Scanner;

public class Programa {
    public void ejecutar() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Amtonio Martinez Sierra 169599 ¿Qué figura quieres?");
            System.out.println("1. Círculo");
            System.out.println("2. Cuadrado");
            System.out.println("3. Salir");
            int figura = scanner.nextInt();

            switch (figura) {
                case 1:
                    System.out.println("¿Qué deseas calcular para el círculo?");
                    System.out.println("1. Radio");
                    System.out.println("2. Circunferencia");
                    System.out.println("3. Área");
                    int opcionCirculo = scanner.nextInt();
                    Circulo circulo1 = new Circulo();
                    switch (opcionCirculo) {
                        case 1:
                            System.out.println("Radio del círculo: " + circulo1.obtenerRadio());
                            break;
                        case 2:
                            System.out.println("Circunferencia del círculo: " + circulo1.calcularCircunferencia());
                            break;
                        case 3:
                            System.out.println("Área del círculo: " + circulo1.calculaAreaCirculo());
                            break;
                        default:
                            System.out.println("Opción no válida.");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("¿Qué deseas calcular para el cuadrado?");
                    System.out.println("1. Lado usado");
                    System.out.println("2. Diagonal");
                    System.out.println("3. Perímetro");
                    System.out.println("4. Área");
                    int opcionCuadrado = scanner.nextInt();
                    Cuadrado cuadrado1 = new Cuadrado();
                    switch (opcionCuadrado) {
                        case 1:
                            System.out.println("Lado usado del cuadrado: " + cuadrado1.obtenerLado1());
                            break;
                        case 2:
                            System.out.println("Diagonal del cuadrado: " + cuadrado1.calculaDiagonal());
                            break;
                        case 3:
                            System.out.println("Perímetro del cuadrado: " + cuadrado1.calcularPeri());
                            break;
                        case 4:
                            System.out.println("Área del cuadrado: " + cuadrado1.calculaArea());
                            break;
                        default:
                            System.out.println("Opción no válida.");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Saliendo del programa.");
                    return; 
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
    }
}
