package ru.netology.statistic;

public class Radio {
    private int maxStation;
    private int minStation;
    private int currentStation = minStation;
    private int maxVolume;
    private int minVolume;
    private int currentVolume = minVolume;

    public Radio(int size) {

        maxStation = minStation + size;
        maxVolume = minVolume + size;
    }

    public int getCurrentStation() {

        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void nextStation() {
        if (currentStation < maxStation) {
            currentStation++;
            return;
        }
        currentStation = minStation;
    }

    public void prevStation() {
        if (currentStation > minStation) {
            currentStation--;
            return;
        }
        currentStation = maxStation;
    }

    public int getVolume() {
        return currentVolume;
    }

    public void setVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            currentVolume = maxVolume;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
            return;
        }
        currentVolume = maxVolume;
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
            return;
        }
        currentVolume = minVolume;
    }
}