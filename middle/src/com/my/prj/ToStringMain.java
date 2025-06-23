package com.my.prj;

class MyClass{
    String name;
    int age;

    MyClass(String name, int age){
        this.name =name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class ToStringMain {
    public static void main(String[] args) {
        MyClass myClass = new MyClass("홍길동", 100);
        System.out.println(myClass);  //객체 출력
        System.out.printf("name : %s, age : %s",myClass.name,myClass.age);
    }
}
