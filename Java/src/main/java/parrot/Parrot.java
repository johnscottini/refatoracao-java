package parrot;

public class Parrot {

    private final ParrotTypeEnum type;
    private final ParrotCharacteristics parrotCharacteristics;

    private static final double BASE_SPEED = 12.0;
    private static final double LOAD_FACTOR = 9.0;
    private static final double MAX_SPEED = 24.0;

    public Parrot(ParrotTypeEnum type, ParrotCharacteristics parrotCharacteristics) {
        this.type = type;
        this.parrotCharacteristics = parrotCharacteristics;
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
        double load = LOAD_FACTOR * parrotCharacteristics.getNumberOfCoconuts();
        double adjustedSpeed = BASE_SPEED - load;
        return Math.max(0, adjustedSpeed);
    }

    private double calculateNorwegianBlueSpeed() {
        if (parrotCharacteristics.isNailed()) {
            return 0;
        }
        return calculateSpeedBasedOnVoltage();
    }

    private double calculateSpeedBasedOnVoltage() {
        double potentialSpeed = parrotCharacteristics.getVoltage() * BASE_SPEED;
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
        boolean isPowered = parrotCharacteristics.getVoltage() > 0;
        return isPowered ? "Bzzzzzz" : "...";
    }
}