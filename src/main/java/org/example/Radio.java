package org.example;

public class Radio {

    private int currentNumberStation; // ч.1_Работа с радиостанциями

    public int getCurrentNumberStation() {
        return currentNumberStation;
    }

    public void setCurrentNumberStation(int currentNumberStation) {
        if (currentNumberStation < 0) {
            return;
        }
        if (currentNumberStation > 9) {
            return;
        }
        this.currentNumberStation = currentNumberStation;
    }

    public void next() {
        if (currentNumberStation < 9) {
            currentNumberStation = currentNumberStation + 1;
        } else {
            currentNumberStation = 0;
        }
    }

    public void prev() {
        if (currentNumberStation > 0) {
            currentNumberStation = currentNumberStation - 1;
        } else {
            currentNumberStation = 9;
        }
    }

    private int currentVolume; // ч.2_Работа с громкостью

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void louder() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        } else {
            return;
        }
    }

    public void quiet() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            return;
        }
    }
}
