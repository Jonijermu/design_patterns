import device.Device;
import device.Radio;
import device.SmartTV;
import device.TV;
import remote.AdvancedRemote;
import remote.BasicRemote;
import remote.SmartRemote;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Testing with Smart Remote on SmartTV ===");
        SmartTV smartTV = new SmartTV();
        SmartRemote smartRemote = new SmartRemote(smartTV);
        smartRemote.power();
        smartRemote.volumeUp();
        smartRemote.volumeUp();
        smartRemote.voiceControl();
        smartTV.browseInternet();
        smartTV.printStatus();

    }

}