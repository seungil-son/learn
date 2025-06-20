package com.my.poly.inter;

public class RemoteControlMain {
    public static void main(String[] args) {
        RemoteControl tv = new Television();
        RemoteControl radio = new Radio();

        tv.turnOn();     // TV On
        radio.turnOn();  // Radio On
    }
}
