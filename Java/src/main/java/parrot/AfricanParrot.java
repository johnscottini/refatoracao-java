package parrot;

public class AfricanParrot extends Parrot{
    private static final String cry = "Sqaark!";

    public AfricanParrot(ParrotCharacteristics parrotCharacteristics) {
        super(parrotCharacteristics);
    }

    @Override
    public double getSpeed() {
        double load = LOAD_FACTOR * parrotCharacteristics.getNumberOfCoconuts();
        double adjustedSpeed = BASE_SPEED - load;
        return Math.max(0, adjustedSpeed);
    }

    @Override
    public String getCry() {
        return cry;
    }
}