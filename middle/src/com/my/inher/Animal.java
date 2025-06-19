package com.my.inher;

/*
    overriding(재정의)
 */

public class Animal {
    public void sound(){
        System.out.println("동물이 소리를 낸다.");
    }
    public void supermethod(){
        System.out.println("i'm superMethod");
    }
}

class Dog extends Animal {

    @Override                               // 재정의 어노테이션
    public void sound(){                   //overriding(재정의)
        System.out.println("BauBau!!");

        super.sound();
    }
    public void submethod(){
    System.out.println("i'm subMethod");
    }

}
