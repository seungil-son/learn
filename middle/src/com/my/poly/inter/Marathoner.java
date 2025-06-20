package com.my.poly.inter;

interface Walkable{
    void walk();
}
interface  Runnable{
    void  run();
}
//인터페이스 다중상속
interface Athlete extends Walkable, Runnable{
    void compete();
}

public class Marathoner implements  Athlete{

    @Override
    public void walk(){
        System.out.println("Marathoner is Walking");
    }
    @Override
    public void run(){
        System.out.println("Marathoner is Running");

    }
    @Override
    public void compete(){
        System.out.println("Marathoner is going Compete ");
    }
}
