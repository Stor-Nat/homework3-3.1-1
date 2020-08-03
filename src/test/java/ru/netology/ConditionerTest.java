package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @Test
    public void shouldGetAndSet() {
        Conditioner conditioner = new Conditioner();
        String expected = "Кондишн";

        assertNull(conditioner.getName());
        conditioner.setName(expected);
        assertEquals(expected, conditioner.getName());
    }

    @Test
    public void increaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        assertEquals(0, conditioner.getIncreaseCurrentTemperature());

        conditioner.setIncreaseCurrentTemperature(25);
        assertEquals(26, conditioner.getIncreaseCurrentTemperature());
    }

    @Test
    public void increaseCurrentTemperature2() {
        Conditioner conditioner = new Conditioner();
        assertEquals(0, conditioner.getIncreaseCurrentTemperature());

        conditioner.setIncreaseCurrentTemperature(30);
        assertEquals(0, conditioner.getIncreaseCurrentTemperature());
    }

    @Test
    public void decreaseSetCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        assertEquals(0, conditioner.getDecreaseCurrentTemperature());

        conditioner.setDecreaseCurrentTemperature(25);
        assertEquals(24, conditioner.getDecreaseCurrentTemperature());
    }

    @Test
    public void decreaseSetCurrentTemperature2() {
        Conditioner conditioner = new Conditioner();
        assertEquals(0, conditioner.getDecreaseCurrentTemperature());

        conditioner.setDecreaseCurrentTemperature(20);
        assertEquals(0, conditioner.getDecreaseCurrentTemperature());
    }
}