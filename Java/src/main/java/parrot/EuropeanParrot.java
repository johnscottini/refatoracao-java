package parrot;

public class EuropeanParrot extends Parrot{

    private static final String cry = "Sqoork!";

    protected EuropeanParrot(ParrotCharacteristics parrotCharacteristics) {
        super(parrotCharacteristics);
    }

    @Override
    public double getSpeed() {
        return BASE_SPEED;
    }

    @Override
    public String getCry() {
        return cry;
    }
}
