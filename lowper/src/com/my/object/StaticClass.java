package com.my.object;

/*
*  Static 멤버(멤버변수, 멤버함수)
*   모든 객체가 공유한다. 클래스 멤버이다.
*   선언과 동시에 초기화를 해야 한다.
*   공통된 멤버인 경우에 사용한다.
*/
class Counter{
    static int staticCount = 0;  // static 필드
    /*
    초기화 블록을 사용한 초기화
    static {
        int staticCount = 0;
    }
    */
    int count= 0;

    Counter(){
        staticCount++;
        count++;
        System.out.printf("staticCount : %d, count : %d\n", staticCount, count);
    }
    // static 메소드
    public static int getStaticCount(){
        return staticCount;
    }
}

public class StaticClass {
    public static void main(String[] args) {
        Counter c1 = new Counter(); // 1, 1
        Counter c2 = new Counter(); // 2, 1

        Counter.staticCount = 10;               // 객체 생성없이 클래스명으로 접근한다. --> 클래스 멤버
        System.out.println(Counter.staticCount);

        System.out.println(Counter.getStaticCount());

        System.out.println(c1.getStaticCount());  // 객체를 통한 접근은 지양한다.

    }
}
