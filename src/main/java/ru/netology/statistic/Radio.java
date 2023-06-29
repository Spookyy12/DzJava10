package ru.netology.statistic;

public class Radio {
    public int maxStation = 9;
    public int minStation = 0;
    private int currentStation = minStation;

    public Radio(int size){
            maxStation = minStation + size;
    }
    public int maxVolume = 100;
    public int minVolume = 0;

    private int currentVolume = minVolume;

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
        if (currentVolume < minVolume ){
            return;
        }
        if (currentVolume > maxVolume){
            currentVolume = maxVolume;
        }
        this.currentVolume = currentVolume;
    }
    public void increaseVolume() {
        if(currentVolume < maxVolume){
            currentVolume++;
            return;
        }
        currentVolume = maxVolume;
    }
    public void decreaseVolume() {
        if(currentVolume > minVolume){
            currentVolume--;
            return;
        }
        currentVolume = minVolume;
    }
}
