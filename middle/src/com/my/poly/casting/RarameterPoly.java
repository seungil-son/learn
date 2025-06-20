package com.my.poly.casting;

/*
    매개변수의 다형성
 */
class Animal2 {
    void speak(){
        System.out.println("Animal sound");
    }
}
class Cheetah2 extends Animal2{
    @Override
    void speak(){
        System.out.println("Cheetah's sound");
    }
}
class Tarzan2 extends Animal2{
    @Override
    void speak(){
        System.out.println("Tarzan's makes Noise");
    }
}
class Jungle2 {
    void makeSound(Animal2 animal){
        animal.speak();
    }
}
public class RarameterPoly {
    public static void main(String[] args) {
        Jungle2 jungle2 = new Jungle2();

        Animal2 tarzan = new Tarzan2();
        Animal2 cheetah = new Cheetah2();

        jungle2.makeSound(tarzan);
        jungle2.makeSound(cheetah);

    }
}
/*
    출력
    Tarzan's makes Noise
    Cheetah's sound

 */
