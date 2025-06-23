package com.my.anony;

public class Home {
    private RemoteControl rc = new RemoteControl() {
        // 익명 구현 객체(클래스 필드에 생성(ex. RemoteControl rc = new RemoteControl() {})
        @Override
        public void turnOn() {
            System.out.println("TV on");
        }

        @Override
        public void turnOff() {
            System.out.println("TV Off");
        }
    };
    public void use(){
        rc.turnOn();
        rc.turnOff();
    }
    public void use2(){
        // 로컬변수로 익명 구현 객체 사용
        RemoteControl rc = new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("A/C On");
            }

            @Override
            public void turnOff() {
                System.out.println("A/C Off");
            }
        };
        rc.turnOn();
        rc.turnOn();
    }
    // 매개변수에 익명객체 사용
    public void use3(RemoteControl rc) {
        rc.turnOn();
        rc.turnOff();
    }
}
