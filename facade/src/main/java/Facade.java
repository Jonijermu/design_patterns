public class Facade {

    JokeClient jokeClient;

    public Facade(JokeClient jokeClient) {
        this.jokeClient = jokeClient;
    }

    String getAttributeValueFromJson(String urlString, String attributeName) throws Exception {
        return jokeClient.getRandomJoke(urlString, attributeName);
    }
}
