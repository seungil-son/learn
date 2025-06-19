package com.my.inher;

public class AnimalMain {
    public static void main(String[] args) {
        Animal a = new Animal();     // 부모타입의 참조 변수로 부모 객체를 가리킨다.
        a.sound();
        a.supermethod();
        System.out.println("-----");

        Animal a2 =new Dog();    // 부모타입의 참조 변수로 자식타입의 객체를 가리킨다.(다형성 - 업케스팅)
        a2.sound();
        a2.supermethod();
        //a2.submethod();        // 부모타입이 기준이 되어 부모타입이 가지고 있는 Method만 접근 할 수 있다.
        System.out.println("-----");

        Dog d = new Dog();
        d.sound();
        d.submethod();
        d.supermethod();
        System.out.println("-----");

    }
}
