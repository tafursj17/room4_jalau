import java.util.Scanner;
// Con este programa se calculara segun los dolares ingresados, cuantos billetes son iguales segun la denominacion.
public class cambioBilletes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad en dólares a cambiar: ");
        int valor_inicial = scanner.nextInt();

        int[] billetes = new int[6];

        cambio(valor_inicial,billetes);

        System.out.println("Billetes para el respectivo cambio: ");
        System.out.println("Cien dólares: " + billetes[0]);
        System.out.println("Cincuenta dólares: " + billetes[1]);
        System.out.println("Veinte dólares: " + billetes[2]);
        System.out.println("Diez dólares: " + billetes[3]);
        System.out.println("Cinco dólares: " + billetes[4]);
        System.out.println("Un dólar: " + billetes[5]);
    }

    public static void cambio(int valor_inicial, int[] billetes) {
        int[] cambio = { 100, 50, 20, 10, 5, 1};

        for (int i = 0; i < cambio.length; i++) {
            billetes[i] = valor_inicial / cambio[i];
        }
    }
}