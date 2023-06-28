package ru.netology.statistic;

public class Radio {
    private int maxStation = 10;
    private int minStation = 0;
    private int currentStation = minStation;

    public Radio(int minStation,int maxStation){
        this.minStation = minStation;
        this.maxStation = maxStation;
        this.currentStation = minStation;
    }
    public Radio(int size){
        maxStation = minStation + size;
        if(size > 9)
            size = 9;
    }

    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }
    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation) {
            currentStation = 9;
            return;
        }
        if (currentStation >= maxStation) {
            currentStation = 0;
            return;
        }
        this.currentStation = currentStation;
    }
    public void nextStation() {
        if (currentStation < maxStation -1 ) {
            currentStation++;
            return;
        }
        currentStation = 0;
    }
    public void prevStation() {
        if (currentStation > minStation) {
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
