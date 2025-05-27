package parrot;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParrotTest {

    @Test
    public void getSpeedOfEuropeanParrot() {
        ParrotCharacteristics characteristics = new ParrotCharacteristics(0, 0, false);
        Parrot parrot = new EuropeanParrot(characteristics);
        assertEquals(12.0, parrot.getSpeed(), 0.0);
    }
    @Test
    public void getSpeedOfAfricanParrot_With_One_Coconut() {
        ParrotCharacteristics characteristics = new ParrotCharacteristics(1, 0, false);
        Parrot parrot = new AfricanParrot(characteristics);
        assertEquals(3.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedOfAfricanParrot_With_Two_Coconuts() {
        ParrotCharacteristics characteristics = new ParrotCharacteristics(2, 0, false);
        Parrot parrot = new AfricanParrot(characteristics);
        assertEquals(0.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedOfAfricanParrot_With_No_Coconuts() {
        ParrotCharacteristics characteristics = new ParrotCharacteristics(0, 0, false);
        Parrot parrot = new AfricanParrot(characteristics);
        assertEquals(12.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedNorwegianBlueParrot_nailed() {
        ParrotCharacteristics characteristics = new ParrotCharacteristics(0, 1.5, true);
        Parrot parrot = new NorwegianBlueParrot(characteristics);
        assertEquals(0.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedNorwegianBlueParrot_not_nailed() {
        ParrotCharacteristics characteristics = new ParrotCharacteristics(0, 1.5, false);
        Parrot parrot = new NorwegianBlueParrot(characteristics);
        assertEquals(18.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedNorwegianBlueParrot_not_nailed_high_voltage() {
        ParrotCharacteristics characteristics = new ParrotCharacteristics(0, 4, false);
        Parrot parrot = new NorwegianBlueParrot(characteristics);
        assertEquals(24.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getCryOfEuropeanParrot() {
        ParrotCharacteristics characteristics = new ParrotCharacteristics(0, 0, false);
        Parrot parrot = new EuropeanParrot(characteristics);
        assertEquals("Sqoork!", parrot.getCry());
    }

    @Test
    public void getCryOfAfricanParrot() {
        ParrotCharacteristics characteristics = new ParrotCharacteristics(1, 0, false);
        Parrot parrot = new AfricanParrot(characteristics);
        assertEquals("Sqaark!", parrot.getCry());
    }
    @Test
    public void getCryOfNorwegianBlueHighVoltage() {
        ParrotCharacteristics characteristics = new ParrotCharacteristics(0, 4, false);
        Parrot parrot = new NorwegianBlueParrot(characteristics);
        assertEquals("Bzzzzzz", parrot.getCry());
    }

    @Test
    public void getCryOfNorwegianBlueNoVoltage() {
        ParrotCharacteristics characteristics = new ParrotCharacteristics(0, 0, false);
        Parrot parrot = new NorwegianBlueParrot(characteristics);
        assertEquals("...", parrot.getCry());
    }
}
