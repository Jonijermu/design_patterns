package station;

import interfaces.Observer;
import interfaces.WeatherInterface;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation extends Thread implements WeatherInterface {

    int temperature;
    int maxTemp = 35;
    int minTemp = -10;
    List<Observer> observers = new ArrayList<>();

    public WeatherStation() {
        this.temperature = 1 + (int) (Math.random() * 10);

    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);

    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(temperature);

        }
    }

    @Override
    public void run() {
        while (true) {
            int delay = 1 + (int) (Math.random() * 5);
            int changeTemp = 1 + (int) (Math.random() * 2);
            if (changeTemp == 1 && temperature < maxTemp) {
                temperature++;
            } else if (changeTemp == 2 && temperature > minTemp) {
                temperature--;

            }
            notifyObserver();
            try {
                sleep(delay * 1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }


}
