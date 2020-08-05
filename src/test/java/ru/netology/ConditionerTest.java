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
    public void shouldIncrease() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(30);
        conditioner.setCurrentTemperature(25);
        conditioner.increaseCurrentTemperature();
        assertEquals(26, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldNotIncrease() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(30);
        conditioner.setCurrentTemperature(30);
        conditioner.increaseCurrentTemperature();
        assertEquals(30, conditioner.getCurrentTemperature());
    }


    @Test
    public void shouldDecrease() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(10);
        conditioner.setCurrentTemperature(11);
        conditioner.decreaseCurrentTemperature();
        assertEquals(10, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldNotDecrease() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(10);
        conditioner.setCurrentTemperature(10);
        conditioner.decreaseCurrentTemperature();
        assertEquals(10, conditioner.getCurrentTemperature());
    }

}