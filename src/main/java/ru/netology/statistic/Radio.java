package ru.netology.statistic;

public class Radio {
    public int maxStation = 10;
    public int minStation = 0;
    private int currentStation = minStation;

    public Radio(int size){
            maxStation = minStation + size;
            if(maxStation > 9)
                maxStation = 9;
    }

    private int currentVolume;
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
