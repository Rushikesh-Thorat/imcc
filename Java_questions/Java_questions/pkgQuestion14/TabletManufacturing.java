package pkgQuestion14;

public class TabletManufacturing {
    private static final double MAX_WEIGHT = 500.0; // Maximum allowed weight in mg

    public static void checkTabletWeight(double weight) throws TabletWeightExceededException {
        if (weight > MAX_WEIGHT) {
            throw new TabletWeightExceededException("Tablet weight exceeds the allowed limit of " + MAX_WEIGHT + " mg.");
        }
        System.out.println("Tablet weight is within the allowed limit.");
    }
}