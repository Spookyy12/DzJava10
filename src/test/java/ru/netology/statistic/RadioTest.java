package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RadioTest {


    @Test
    public void chanelSelection() {
        Radio radio = new Radio();
        radio.setStationNumber(6);
        int expect = 6;
        int actual = radio.getStationNumber();
        Assertions.assertEquals(expect, actual);
    }

    @Test
    public void nextChannelIfHighNine() {
        Radio radio = new Radio();
        radio.setStationNumber(100);
        int expect = 0;
        int actual = radio.getStationNumber();
        Assertions.assertEquals(expect, actual);
    }

    @Test
    public void prevChannelIfLowZero() {
        Radio radio = new Radio();
        radio.setStationNumber(-1);
        int expect = 9;
        int actual = radio.getStationNumber();
        Assertions.assertEquals(expect, actual);
    }

    @Test
    public void increaseVolume() {
        Radio radio = new Radio();
        radio.setIncreaseVolume(80);
        int expect = 81;
        int actual = radio.getVolume();
        Assertions.assertEquals(expect, actual);
    }

    @Test
    public void increaseHighLimitVolume() {
        Radio radio = new Radio();
        radio.setIncreaseVolume(101);
        int expect = 100;
        int actual = radio.getVolume();
        Assertions.assertEquals(expect, actual);
    }
    @Test
    public void DecreaseVolume() {
        Radio radio = new Radio();
        radio.setDecreaseVolume(46);
        int expect = 45;
        int actual = radio.getVolume();
        Assertions.assertEquals(expect, actual);
    }
    @Test
    public void DecreaseLowLimitVolume() {
        Radio radio = new Radio();
        radio.setDecreaseVolume(-1);
        int expect = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expect, actual);
    }
}