import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ExchangeRateService api = new ExchangeRateService();

        while (true) {
            Conversor.exibirMenu();

            System.out.print("Ingrese una opción: ");
            int opcion = scanner.nextInt();

            if (opcion == 7) {
                System.out.println("¡Gracias por usar el conversor!");
                return;
            }

            System.out.print("Ingrese el valor a convertir: ");
            double valor = scanner.nextDouble();

            String from = "";
            String to = "";

            switch (opcion) {
                case 1: from = "USD"; to = "ARS"; break;
                case 2: from = "ARS"; to = "USD"; break;
                case 3: from = "USD"; to = "BRL"; break;
                case 4: from = "BRL"; to = "USD"; break;
                case 5: from = "USD"; to = "COP"; break;
                case 6: from = "COP"; to = "USD"; break;

                default:
                    System.out.println("Opción inválida.");
                    continue;
            }

            double rate = api.getRate(from, to);

            if (rate == 0) {
                System.out.println("Error obteniendo las tasas.");
                continue;
            }

            double resultado = valor * rate;

            System.out.println("-------------------------------------------------");
            System.out.println(valor + " " + from + " = " + resultado + " " + to);
            System.out.println("Tasa aplicada: 1 " + from + " = " + rate + " " + to);
            System.out.println("-------------------------------------------------");
        }
    }
}
