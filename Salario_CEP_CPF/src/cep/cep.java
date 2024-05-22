package cep;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

/**
 *
 * @author Gu
 */
public class cep {
    
    public static void main(String[] args) throws Exception {
        
         Scanner scanner = new Scanner(System.in);
        
         System.out.print("Digite seu CEP: ");
         String cep = scanner.nextLine();
        
         HttpClient client = HttpClient.newHttpClient();
         HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI("https://viacep.com.br/ws/" + cep + "/json/"))
                .build();
        
         HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
         
         System.out.println("O endereço associado ao CEP é: " + response.body());

         
         
    }
}
