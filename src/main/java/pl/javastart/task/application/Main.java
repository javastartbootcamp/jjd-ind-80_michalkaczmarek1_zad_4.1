package pl.javastart.task.application;

import pl.javastart.task.data.Televisor;

public class Main {

    public static void main(String[] args) {
        Televisor televisor1 = new Televisor();
        televisor1.showStatus();
        televisor1.turnOn();
        televisor1.showStatus();
        televisor1.turnOff();
        televisor1.showStatus();
    }
}
