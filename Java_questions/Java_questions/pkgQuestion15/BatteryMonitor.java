package pkgQuestion15;

public class BatteryMonitor {
	public static void main(String[] args) {
        int[] testBatteryLevels = {25, 18, 9, 5, 0};

        for (int level : testBatteryLevels) {
            MobileDevice device = new MobileDevice(level);
            try {
                device.checkBattery();
            } catch (LowBatteryException e) {
                System.out.println("Warning: " + e.getMessage());
            } catch (InsufficientChargeException e) {
                System.out.println("Critical Alert: " + e.getMessage());
            }
        }
    }
}
