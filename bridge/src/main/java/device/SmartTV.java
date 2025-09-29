package device;

public class SmartTV extends TV {

    public void browseInternet() {
        if (isEnabled()) {
            System.out.println("Browsing Internet");
        } else {
            System.out.println("cannot browse internet while tv is off");
        }
    }

}
