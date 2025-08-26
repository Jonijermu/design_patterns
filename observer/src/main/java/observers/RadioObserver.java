package observers;

import interfaces.Observer;

public class RadioObserver implements Observer {

    @Override
    public void update(int temperature) {
        System.out.println("Radio alerts the temperature is: " + temperature);
    }
}
