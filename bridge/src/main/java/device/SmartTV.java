package device;

public class SmartTV extends TV {


    public void browseInternet() {
        if (isEnabled()) {
            System.out.println("Browsing Internet");
        } else {
            System.out.println("cannot browse internet while tv is off");
        }
    }

    @Override
    public void printStatus() {
        System.out.println("------------------------------------");
        System.out.println("| I'm Smart TV set.");
        System.out.println("| I'm " + (isEnabled() ? "enabled" : "disabled"));
        System.out.println("| Current volume is " + getVolume() + "%");
        System.out.println("| Current channel is " + getChannel());
        System.out.println("------------------------------------\n");
    }
}


