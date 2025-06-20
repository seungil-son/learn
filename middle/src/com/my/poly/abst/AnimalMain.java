package com.my.poly.abst;

public class AnimalMain {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        System.out.println("함수 호출");
        a1.makeSound();
        a2.makeSound();
        System.out.println("--------");

        Animal[] animals = {new Dog(),new Cat()}; // 배열 형태로 생성;

        System.out.println("for문");
        for(int i= 0; i < animals.length; i++)
        {
            animals[i].makeSound();
        }
        System.out.println("-------");

        System.out.println("향상된 for문");
        for(Animal animal : animals)
        {
            animal.makeSound();
        }
    }
}
/*
    함수 호출
    BauBau!!
    MeowMeow!!
    --------
    for문
    BauBau!!
    MeowMeow!!
    -------
    향상된 for문
    BauBau!!
    MeowMeow!!
 */
