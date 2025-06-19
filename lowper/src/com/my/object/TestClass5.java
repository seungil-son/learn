package com.my.object;

/* 생성자
     클래스 이름과 같은 메서드이며 출력이 없다.
     객체 생성 시 호출되고 초기화를 담당
     명시적으로 생성자를 만들면 더이상 자동으로 디폴트 생성자(new ConsClass();)는 호출되지 않는다.
     디폴트 생성자를 따로 사용하고 싶다면 디폴트 생성자를 만들어야 한다.
*/
class ConsClass {
    private String name; // 필드 선언

    // 생성자의 다중정의(Overroding)
    ConsClass(String name){  // 인자를 하나받는 생성자
        this.name = name; // this.필드 = 매개변수(ConsClass(String name))
    }
    ConsClass(){}  // 명시적으로 디폴트 생성자를 만든다.

    public void showData()
    {
        System.out.println(this.name);
    }

}

public class TestClass5 {
    public static void main(String[] args) {
        ConsClass obj = new ConsClass("홍길동");  // 13번째 위치한 생성자는 인자(String name)을 가진 생성자이기에 값이 있어야한다.
        obj.showData();

        ConsClass obj2 = new ConsClass(); // 디폴트 생성자
        obj2.showData();
    }
}
