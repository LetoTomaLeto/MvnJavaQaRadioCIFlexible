package ru.netology.radio;

public class Radio {
    private int numberStation = 20;
    private int minStation = 0;
    private int maxStation = 19;
    private int currentStation;
    private int currentVolume;

    public Radio() {

    }

    public Radio(int numberStation) {
        this.numberStation = numberStation;
        this.maxStation = this.numberStation - 1;
    }




    public int getCurrentStation() {

        return currentStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStation) {
            return;
        }
        if (newCurrentStation > maxStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

   public void nextStation() {

        if (currentStation < maxStation) {
            currentStation = currentStation + 1;
        } else {
            currentStation = minStation;
        }
    }

    public void prevStation() {

        if (currentStation > minStation) {
            currentStation = currentStation - 1;
        } else {
            currentStation = maxStation;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {

        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {

        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

}