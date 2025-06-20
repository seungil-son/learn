package com.my.poly.inter;

interface Flyable {
    void Fly();
}
interface  Swimmable{
    void Swim();
}
interface Moveable{
    void Move();
}
class Duck implements Flyable, Swimmable, Moveable{
    @Override
    public void Fly(){
        System.out.println("오리 날다.");
    }
    @Override
    public void Swim(){
        System.out.println("Duck Swim");
    }
    @Override
    public void Move(){
        System.out.println("Duck Move");

    }
}
public class MultiInterface {
    public static void main(String[] args) {
        Duck duck = new Duck(); // 다형성 x
        duck.Fly();
        duck.Move();
        duck.Swim();

        Flyable flyable = new Duck();
        flyable.Fly();

        Swimmable swimmable = new Duck();
        swimmable.Swim();

        Moveable moveable = new Duck();
        moveable.Move();

    }
}
/*
    출력
    오리 날다.
    Duck Move
    Duck Swim
    오리 날다.
    Duck Swim
    Duck Move

 */