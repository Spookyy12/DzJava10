package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetStation() {

        Radio radio = new Radio(9);

        radio.setCurrentStation(8);
        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetStationMaxLimit() {
        Radio radio = new Radio(9);

        radio.setCurrentStation(10);
        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationMinLimit() {
        Radio radio = new Radio(9);

        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStation() {
        Radio radio = new Radio(9);

        radio.setCurrentStation(5);
        radio.nextStation();

        int expected = 6;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationHighLimit() {
        Radio radio = new Radio(9);

        radio.setCurrentStation(9);
        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStation() {
        Radio radio = new Radio(10);

        radio.setCurrentStation(4);
        radio.prevStation();

        int expected = 3;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationMinLimit() {
        Radio radio = new Radio(9);

        radio.setCurrentStation(0);
        radio.prevStation();

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio();


        radio.setVolume(15);
        int expected = 15;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeMinLimit() {
        Radio radio = new Radio();


        radio.setVolume(-1);
        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeMaxLimit() {
        Radio radio = new Radio();


        radio.setVolume(1501);
        int expected = 100;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setVolume(67);
        radio.increaseVolume();
        int expected = 68;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeMaxLimit() {
        Radio radio = new Radio();
        radio.setVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setVolume(45);
        radio.decreaseVolume();
        int expected = 44;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeMinLimit() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }
}
