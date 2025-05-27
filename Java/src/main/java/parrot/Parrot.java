package parrot;

public class Parrot {

    private final ParrotTypeEnum type;
    private final int numberOfCoconuts;
    private final double voltage;
    private final boolean isNailed;

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
        return getBaseSpeed();
    }

    private double calculateAfricanSpeed() {
        return Math.max(0, getBaseSpeed() - getLoadFactor() * numberOfCoconuts);
    }

    private double calculateNorwegianBlueSpeed() {
        if (isNailed) {
            return 0;
        }
        return calculateSpeedBasedOnVoltage();
    }

    private double calculateSpeedBasedOnVoltage() {
        return Math.min(24.0, voltage * getBaseSpeed());
    }

    private double getLoadFactor() {
        return 9.0;
    }

    private double getBaseSpeed() {
        return 12.0;
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
        return voltage > 0 ? "Bzzzzzz" : "...";
    }
}