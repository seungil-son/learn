package com.my.poly.abst;

public class Animal {
    public  void makeSound() {
        System.out.println("Animal's Sound");
    }
}
class Dog extends Animal {
    @Override
    public void makeSound(){
        System.out.println("BauBau!!");
    }
}
class Cat extends Animal{
    @Override
    public void makeSound(){
        System.out.println("MeowMeow!!");
    }
}