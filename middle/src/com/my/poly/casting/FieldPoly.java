package com.my.poly.casting;

/*
    필드의 다형성
    멤버변수가 상위타입이고 하위 타입의 변수가 객체가 되는 형태
 */
class Animal{
    void speak(){
        System.out.println("Animal sound");
    }
}
class Cheetah extends Animal{
    @Override
    void speak(){
        System.out.println("Cheetah's sound");
    }
}
class Tarzan extends Animal{
    @Override
    void speak(){
        System.out.println("Tarzan's makes Noise");
    }
}
class Jungle {
    Animal animal;
    void makeSound(){
        animal.speak();
    }
}
public class FieldPoly {
    public static void main(String[] args) {
        Jungle jungle = new Jungle();   // 정글객체 생성
        jungle.animal = new Cheetah();  // 자식객체인 치타를 연결
        jungle.makeSound();
        jungle.animal = new Tarzan();   // 자식객체인 타잔을 연결
        jungle.makeSound();
    }
}
/*
    출력
    Cheetah's sound
    Tarzan's makes Noise
 */
