package pl.javastart.task.data;

public class Televisor {

    private boolean isPlayed = false;

    public boolean turnOn() {
        isPlayed = true;
        return isPlayed;
    }

    public boolean turnOff() {
        isPlayed = false;
        return isPlayed;
    }

    public boolean getIsPlayed() {
        return isPlayed;
    }

    public void setPlayed(boolean played) {
        isPlayed = played;
    }

    public void showStatus() {
        System.out.printf("Czy telewizor jest włączony?: %b \n", isPlayed);
    }
}
