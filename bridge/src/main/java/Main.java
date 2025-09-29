import device.Device;
import device.Radio;
import device.SmartTV;
import device.TV;
import remote.AdvancedRemote;
import remote.BasicRemote;
import remote.SmartRemote;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Testing with Basic Remote on TV ===");
        Device tv = new TV();
        BasicRemote basicRemote = new BasicRemote(tv);
        basicRemote.power();
        basicRemote.volumeUp();
        basicRemote.channelUp();
        tv.printStatus();

        System.out.println("=== Testing with Advanced Remote on Radio ===");
        Device radio = new Radio();
        AdvancedRemote advancedRemote = new AdvancedRemote(radio);
        advancedRemote.power();
        advancedRemote.volumeUp();
        advancedRemote.mute();
        radio.printStatus();

        System.out.println("=== Testing with Smart Remote on SmartTV ===");
        SmartTV smartTV = new SmartTV();
        SmartRemote smartRemote = new SmartRemote(smartTV);
        smartRemote.power();
        smartRemote.volumeUp();
        smartRemote.voiceControl();
        smartTV.browseInternet();
        smartTV.printStatus();

    }

}