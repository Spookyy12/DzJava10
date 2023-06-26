package ru.netology.statistic;

public class Radio {
    public int stationNumber;

    public int getStationNumber() {
        return stationNumber;
    }

    public void setStationNumber(int newStationNumber) {
        if (newStationNumber > 9) {
            newStationNumber = 0;
            return;
        }
        if (newStationNumber < 0) {
            newStationNumber = 9;

        }
        stationNumber = newStationNumber;

    }

    public int volume;

    public int getVolume() {
        return volume;
    }

    public void setIncreaseVolume(int newVolume) {
        if (newVolume < 100) {
            newVolume = newVolume + 1;
        }
        if (newVolume > 100){
            newVolume = 100;
        }
        volume = newVolume;
    }

    public void setDecreaseVolume(int newVolume) {
        if (newVolume > 0) {
            newVolume = newVolume - 1;
        }
        if (newVolume < 0) {
            newVolume = 0;
        }
        volume = newVolume;
    }
}
