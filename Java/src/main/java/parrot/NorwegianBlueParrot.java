package parrot;

public class NorwegianBlueParrot extends Parrot {

    protected NorwegianBlueParrot(ParrotCharacteristics parrotCharacteristics) {
        super(parrotCharacteristics);
    }

    private double calculateSpeedBasedOnVoltage() {
        double potentialSpeed = parrotCharacteristics.getVoltage() * BASE_SPEED;
        double limitedSpeed = Math.min(MAX_SPEED, potentialSpeed);
        return limitedSpeed;
    }

    @Override
    public double getSpeed() {
        if (parrotCharacteristics.isNailed()) {
            return 0;
        }
        return calculateSpeedBasedOnVoltage();
    }

    @Override
    public String getCry() {
        boolean isPowered = parrotCharacteristics.getVoltage() > 0;
        return isPowered ? "Bzzzzzz" : "...";
    }
}
