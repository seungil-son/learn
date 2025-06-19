package com.my.object;

public class SingtonMain {
    public static void main(String[] args) {
        SingTon obj = SingTon.getInstance();   // SingTon.java에서 private로 선언해놨기 때문에 new SingTon();는 사용할 수 없다.
        SingTon obj2 = SingTon.getInstance();

        obj.showMessage();
        obj2.showMessage();

        System.out.println(obj == obj2);
    }
}
