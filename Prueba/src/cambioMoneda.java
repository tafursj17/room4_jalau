import java.util.Scanner;

public class cambioMoneda {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pesoColombiano = 0;
        double dolar= 0;
        int opcion;

        System.out.println("Escoga una opcion:" +
                " \n 1.Cambiar de peso colombiano a dolar " +
                "\n 2.Cambiar de dolar a peso colombiano");
        opcion = scanner.nextInt();

        if (opcion==1){
            System.out.println("El resultado del cambio a dolares es: $" +cambioDolarPeso(pesoColombiano));
        } else if (opcion==2) {
            System.out.println("El resultado del cambio a pesos colombiano es: $"+cambioPesoDolar(dolar));
        } else {
            System.out.println("Opcion no valida");
        }

    }
    //Cambiar de Peso colombiano a dolar
    public static double cambioDolarPeso(double pesoColombiano){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor en dolares que quiere cambiar a pesos colombianos: ");
        pesoColombiano = scanner.nextDouble();
        pesoColombiano = (pesoColombiano * 3977);
        return Math.round(pesoColombiano);
    }
    //Cambiar Peso colombiano a dolar
    public static double cambioPesoDolar(double dolar){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor en pesos colombianos que quiere cambiar a dolares: ");
        dolar = scanner.nextDouble();
        dolar = dolar / 3977;
        return Math.round(dolar);
    }

}
