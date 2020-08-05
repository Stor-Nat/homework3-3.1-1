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
// Устанавливаем максимальную температуру
    @Test
    public void shouldMaxTemperature() {
        Conditioner conditioner = new Conditioner();
        int maxTemperature = 30;

        conditioner.setMaxTemperature(30);
        assertEquals(maxTemperature, conditioner.getMaxTemperature());
    }
// Устанавливаем минимальную температуру
    @Test
    public void shouldMinTemperature() {
        Conditioner conditioner = new Conditioner();
        int minTemperature = 20;

        conditioner.setMinTemperature(minTemperature);
        assertEquals(minTemperature, conditioner.getMinTemperature());
    }


    // Средняя 25, + увеличивается на градус, - уменьшается на градус
    @Test
    public void shouldCurrentTemperature3() {
        Conditioner conditioner = new Conditioner();
        int currentTemperature = 25;

        conditioner.setCurrentTemperature(currentTemperature);
        assertEquals(currentTemperature, conditioner.getCurrentTemperature());
    }

    @Test
    public void increaseCurrentTemperature3() {
        Conditioner conditioner = new Conditioner();
        conditioner.increaseCurrentTemperature();
    }

    @Test
    public void decreaseCurrentTemperature3() {
        Conditioner conditioner = new Conditioner();
        conditioner.decreaseCurrentTemperature();
    }


// Средняя температура 30, увеличение-ничего и понижение-убавляется
    @Test
    public void shouldCurrentTemperature1() {
        Conditioner conditioner = new Conditioner();
        int currentTemperature = 30;

        conditioner.setCurrentTemperature(currentTemperature);
        assertEquals(currentTemperature, conditioner.getCurrentTemperature());
    }

    @Test
    public void increaseCurrentTemperature1() {
        Conditioner conditioner = new Conditioner();
        conditioner.increaseCurrentTemperature();
    }

// Средняя температура 20, увеличение-добавляется, понижение-ничего
    @Test
    public void shouldCurrentTemperature2() {
        Conditioner conditioner = new Conditioner();
        int currentTemperature = 20;

        conditioner.setCurrentTemperature(currentTemperature);
        assertEquals(currentTemperature, conditioner.getCurrentTemperature());
    }

    @Test
    public void decreaseCurrentTemperature2() {
        Conditioner conditioner = new Conditioner();
        conditioner.decreaseCurrentTemperature();
    }


}