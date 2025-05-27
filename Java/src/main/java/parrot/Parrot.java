package parrot;

public abstract class Parrot implements ParrotBehavior{
    protected final ParrotCharacteristics parrotCharacteristics;

    protected static final double BASE_SPEED = 12.0;
    protected static final double LOAD_FACTOR = 9.0;
    protected static final double MAX_SPEED = 24.0;

    protected Parrot(ParrotCharacteristics parrotCharacteristics) {
        this.parrotCharacteristics = parrotCharacteristics;
    }
}