package ru.netology.statistic;

public class Radio {
    private int currentStation;
    private int currentVolume;
    public int getCurrentStation() {
        return currentStation;
    }
    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }
    public void nextStation() {
        if (currentStation < 9) {
            currentStation++;
            return;
        }
        currentStation = 0;
    }
    public void prevStation() {
        if (currentStation > 0) {
            currentStation--;
            return;
        }
        currentStation = 9;
    }
    public int getVolume() {
        return currentVolume;
    }
    public void setVolume(int currentVolume) {
        if (currentVolume < 0 ){
            return;
        }
        if (currentVolume > 100){
            currentVolume = 100;
        }
        this.currentVolume = currentVolume;
    }
    public void increaseVolume() {
        if(currentVolume < 100){
            currentVolume++;
            return;
        }
        currentVolume = 100;
    }
    public void decreaseVolume() {
        if(currentVolume > 0){
            currentVolume--;
            return;
        }
        currentVolume = 0;
    }
}