package parrot;

public class Parrot {

    private final ParrotTypeEnum type;
    private final int numberOfCoconuts;
    private final double voltage;
    private final boolean isNailed;

    private static final double BASE_SPEED = 12.0;
    private static final double LOAD_FACTOR = 9.0;
    private static final double MAX_SPEED = 24.0;

    public Parrot(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed) {
        this.type = type;
        this.numberOfCoconuts = numberOfCoconuts;
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    public double getSpeed() {
        return switch (type) {
            case EUROPEAN -> calculateEuropeanSpeed();
            case AFRICAN -> calculateAfricanSpeed();
            case NORWEGIAN_BLUE -> calculateNorwegianBlueSpeed();
        };
    }

    private double calculateEuropeanSpeed() {
        return BASE_SPEED;
    }

    private double calculateAfricanSpeed() {
        double load = LOAD_FACTOR * numberOfCoconuts;
        double adjustedSpeed = BASE_SPEED - load;
        return Math.max(0, adjustedSpeed);
    }

    private double calculateNorwegianBlueSpeed() {
        if (isNailed) {
            return 0;
        }
        return calculateSpeedBasedOnVoltage();
    }

    private double calculateSpeedBasedOnVoltage() {
        double potentialSpeed = voltage * BASE_SPEED;
        double limitedSpeed = Math.min(MAX_SPEED, potentialSpeed);
        return limitedSpeed;
    }

    public String getCry() {
        return switch (type) {
            case EUROPEAN -> europeanCry();
            case AFRICAN -> africanCry();
            case NORWEGIAN_BLUE -> norwegianBlueCry();
        };
    }

    private String europeanCry() {
        return "Sqoork!";
    }

    private String africanCry() {
        return "Sqaark!";
    }

    private String norwegianBlueCry() {
        boolean isPowered = voltage > 0;
        return isPowered ? "Bzzzzzz" : "...";
    }
}