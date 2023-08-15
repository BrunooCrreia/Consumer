package Services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import entities.Company;

public class KairosService {

    private HttpURLConnection connection;

    public HttpURLConnection openConnectionApi(Company company, String endPoint) throws IOException {
        URL url = new URL("https://www.dimepkairos.com.br/RestServiceApi/" + endPoint);

        this.connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setRequestProperty("identifier", company.getCnpjCompany());
        connection.setRequestProperty("key", company.getKeyCompany());
        connection.setDoOutput(true);

        return connection;

    }

    public HttpURLConnection getConnection() {
        return connection;
    }

    public String sendRquestApi(HttpURLConnection connection, String requestBody) throws IOException {
        // Envio do corpo da requisição
        OutputStream outputStream = connection.getOutputStream();
        outputStream.write(requestBody.getBytes());
        outputStream.flush();

        // Verificação do código de resposta
        return connection.getResponseMessage();

    }

    public String readingApi() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String line;
        StringBuilder response = new StringBuilder();
        while ((line = reader.readLine()) != null) {
            response.append(line);
        }
        reader.close();
        connection.disconnect();
        return response.toString();

    }
    public void closeConnection(){
        connection.disconnect();
    }
}

