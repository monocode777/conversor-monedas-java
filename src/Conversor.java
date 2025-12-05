import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Conversor {

    private static final String API_KEY = "856218e80440da8602c53fac";
    private static final Gson gson = new Gson();
    private static final HttpClient cliente = HttpClient.newHttpClient();


    // ============================================================
    // MÉTODO: Mostrar menú
    // ============================================================
    public static void exibirMenu() {
        System.out.println("""
                ************************************************************
                Sea bienvenido/a al Conversor de Moneda =]

                1) Dólar  ==> Peso argentino
                2) Peso argentino ==> Dólar
                3) Dólar ==> Real brasileño
                4) Real brasileño ==> Dólar
                5) Dólar ==> Peso colombiano
                6) Peso colombiano ==> Dólar
                7) Salir

                Elija una opción válida:
                ************************************************************
                """);
    }


    // ============================================================
    // MÉTODO: Obtener todas las tasas de la moneda base
    // ============================================================
    public static JsonObject obtenerTasas(String monedaBase) throws Exception {

        String url = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/" + monedaBase;

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();

        HttpResponse<String> response =
                cliente.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() != 200) {
            throw new RuntimeException("Error al consultar API");
        }

        JsonObject json = gson.fromJson(response.body(), JsonObject.class);

        return json.getAsJsonObject("conversion_rates");
    }


    // ============================================================
    // MÉTODO: Calcular conversión
    // ============================================================
    public static double convertir(double cantidad, double tasa) {
        return cantidad * tasa;
    }


    // ============================================================
    // MAIN - MENÚ INTERACTIVO
    // ============================================================
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 7) {

            exibirMenu();
            opcion = sc.nextInt();

            if (opcion == 7) {
                System.out.println("Saliendo del programa...");
                break;
            }

            System.out.print("Ingrese la cantidad a convertir: ");
            double cantidad = sc.nextDouble();

            try {
                String origen = "";
                String destino = "";

                switch (opcion) {
                    case 1 -> { origen = "USD"; destino = "ARS"; }
                    case 2 -> { origen = "ARS"; destino = "USD"; }
                    case 3 -> { origen = "USD"; destino = "BRL"; }
                    case 4 -> { origen = "BRL"; destino = "USD"; }
                    case 5 -> { origen = "USD"; destino = "COP"; }
                    case 6 -> { origen = "COP"; destino = "USD"; }
                    default -> {
                        System.out.println("Opción inválida.");
                        continue;
                    }
                }

                // 1. obtener tasas reales desde API
                JsonObject tasas = obtenerTasas(origen);

                // 2. leer tasa destino
                double tasa = tasas.get(destino).getAsDouble();

                // 3. convertir
                double resultado = convertir(cantidad, tasa);

                // 4. mostrar resultado
                System.out.println("-------------------------------------------------");
                System.out.println(cantidad + " " + origen + " = " + resultado + " " + destino);
                System.out.println("-------------------------------------------------");

            } catch (Exception e) {
                System.out.println("Error durante la conversión: " + e.getMessage());
            }

        }

        sc.close();
    }
}
