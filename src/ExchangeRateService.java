
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class ExchangeRateService {

    private static final String API_URL =
            "https://v6.exchangerate-api.com/v6/856218e80440da8602c53fac/latest/USD";

    public double getRate(String from, String to) {
        try {
            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(API_URL))
                    .build();

            HttpResponse<String> response =
                    client.send(request, HttpResponse.BodyHandlers.ofString());

            Gson gson = new Gson();
            JsonObject json = gson.fromJson(response.body(), JsonObject.class);

            JsonObject rates = json.getAsJsonObject("conversion_rates");

            double usdToTarget = rates.get(to).getAsDouble();
            double usdToSource = rates.get(from).getAsDouble();

            return usdToTarget / usdToSource;

        } catch (Exception e) {
            System.out.println("Error al conectar con la API: " + e.getMessage());
            return 0;
        }
    }
}
