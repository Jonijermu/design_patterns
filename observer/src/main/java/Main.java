import interfaces.Observer;
import observers.PhoneObserver;
import observers.RadioObserver;
import observers.TvObserver;
import station.WeatherStation;

public class Main {

    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        Observer phoneObserver = new PhoneObserver();
        Observer radioObserver = new RadioObserver();
        Observer tvObserver = new TvObserver();
        station.addObserver(phoneObserver);
        station.addObserver(radioObserver);
        station.addObserver(tvObserver);
        station.start();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\n--- Removing TV Observer ---\n");
        station.removeObserver(tvObserver);

    }
}
