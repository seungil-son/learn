package com.my.anony;

public class HomeMain {
    public static void main(String[] args) {
        Home h = new Home();
        h.use();
        h.use2();
        h.use3(new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("Lamp On");
            }

            @Override
            public void turnOff() {
                System.out.println("Lamp Off");
            }
        });
    }
}
