package observers;

import interfaces.Observer;

public class PhoneObserver implements Observer {

    @Override
    public void update(int temperature) {
        System.out.println("Phone shows temperature is: " + temperature + " celsius");

    }

}
