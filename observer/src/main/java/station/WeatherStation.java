package station;

import interfaces.Observer;
import interfaces.WeatherInterface;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation extends Thread implements WeatherInterface {

    int temperature = 1 + (int) (Math.random() * 24);
    int maxTemp = 35;
    int minTemp = -10;
    List<Observer> observers = new ArrayList<>();

    public WeatherStation() {
        this.temperature = temperature;

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
            if (changeTemp == 1) {
                temperature += 1;
            } else {
                temperature -= 1;
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
