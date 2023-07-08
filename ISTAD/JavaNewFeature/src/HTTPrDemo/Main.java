package HTTPrDemo;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        // Get users value from jsonplaceholder
        HttpClient client = HttpClient.newHttpClient();
        // Create a request to use with client
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("https://jsonplaceholder.typicode.com/users")).GET()
                .build();
        // Use client in order to send the request
        // HttpResponse<String> response=...
        var respond = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(respond.body());
    }
}
