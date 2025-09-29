package remote;

import device.Device;

public class SmartRemote extends BasicRemote {

    public SmartRemote(Device device) {
        super.device = device;
    }

    public void mute() {
        System.out.println("Remote: mute");
        device.setVolume(0);
    }

    public void voiceControl() {
        System.out.println("Voice control active");
    }
}
