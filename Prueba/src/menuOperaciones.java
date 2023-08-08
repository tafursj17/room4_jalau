import java.util.Map;
import java.util.Scanner;

public class menuOperaciones {

    public static void main(String[] args) {

        int opcion = 0;
        Scanner scanner = new Scanner(System.in);

        while (opcion != 3){
            System.out.println("Seleccione una opcion: ");
            System.out.println("1. Potenciación");
            System.out.println("2. Raiz cuadrada");
            System.out.println("3. Terminar");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    potenciacion();
                    break;

                case 2:
                    raizCuadrada();
                    break;

                case 3:
                    System.out.println("¡Programa terminado!");
                    break;

                default:
                    System.out.println(" ");
                    System.out.println("Opcion invalida. Intente de nuevo");
            }
        }
    }

    public static void potenciacion() {

        Scanner scanner = new Scanner(System.in);
        double base, resultado = 0;
        int exponente;

        System.out.print("Ingrese la base: ");
        base = scanner.nextDouble();
        System.out.print("Ingrese el exponente: ");
        exponente = scanner.nextInt();

        resultado = Math.pow(base, exponente);
        System.out.println("El resultado de " + base + " elevado a la " + exponente + " es: " + resultado);
    }

    public static void raizCuadrada() {

        Scanner scanner = new Scanner(System.in);
        double numero, raizCuadrada;

        System.out.println("Ingrese el numero: ");
        numero = scanner.nextDouble();

        if (numero > 0) {
            raizCuadrada = Math.sqrt(numero);
            System.out.println("La raiz cuadrada de " + numero + " es: " + raizCuadrada);
        } else {
            System.out.println("No es posible calcular la raiz de un numero negativo");
        }
    }
}