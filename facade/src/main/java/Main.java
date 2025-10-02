import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {
        JokeClient apiClient = new JokeClient();
        Facade facade = new Facade(apiClient);

        try {
            String jokeUrl = "https://api.chucknorris.io/jokes/random";
            String joke = facade.getAttributeValueFromJson(jokeUrl, "value");
            System.out.println("Joke: " + joke);

            String exchangeUrl = "https://api.fxratesapi.com/latest";
            String rates = facade.getAttributeValueFromJson(exchangeUrl, "base");
            System.out.println(rates);
        } catch (IOException e) {
            System.err.println("Network error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.err.println("JSON error: " + e.getMessage());

        }
    }
}