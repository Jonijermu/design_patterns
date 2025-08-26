package interfaces;

public interface WeatherInterface {

    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
}
