package observers;

import interfaces.Observer;

public class TvObserver implements Observer {

    @Override
    public void update(int temperature) {
        System.out.println("Tv shows the temperature is: " + temperature);
    }
}
