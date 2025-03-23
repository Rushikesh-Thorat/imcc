package pkgQuestion15;

public class MobileDevice {
	private int batteryLevel;

    public MobileDevice(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public void checkBattery() throws LowBatteryException, InsufficientChargeException {
        if (batteryLevel <= 0) {
            throw new InsufficientChargeException("Battery depleted! Device shutting down.");
        } else if (batteryLevel < 10) {
            System.out.println("Battery critically low! Switching to power saver mode.");
            throw new InsufficientChargeException("Battery critically low! Please charge immediately.");
        } else if (batteryLevel < 20) {
            throw new LowBatteryException("Battery low! Please charge your device soon.");
        } else {
            System.out.println("Battery level is sufficient: " + batteryLevel + "%");
        }
    }
}
