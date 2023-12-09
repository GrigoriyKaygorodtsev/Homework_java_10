public class Radio {
    private int currentStation;

    private int currentVolume;


    public void next() {
        if (currentStation < 9) {
            currentStation = currentStation +1;

        }



    }

    public void prev() {
        if (currentStation > 0) {
            currentStation = currentStation -1;

        }


    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume +1;

        }


    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume -1;

        }


    }


    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {

        }else {

        }
        if (currentStation > 9) {

        }else {

        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {

        }else  {

        }
        if (currentVolume > 100) {

        }else {


        }
        this.currentVolume = currentVolume;
    }
}
