package com.my.object;

/* 접근제한자
    private(클래스) < default(패키지) < protected(상속내) < public(open)
*/

class Person {
    private String name;
    int defaultval = 10;
    public String publicval = "publicval Access modifier";

    // setter : 외부 접근을 막고 유효성능 검사를 통해 필드값을 초기화한다.
    public void setName(String name) {
            this.name = name;
    }

    // getter : 외부에서 객체필드를 읽어들일 때 원하는 형태로 변경하여 리턴할 수 있다.
    public String getName() {  // return값으로 출력이 있으니 void(x) -> String(o)
        return this.name;
    }
}

public class AccessMain {
    public static void main(String[] args) {
        Person p = new Person();

        p.setName("Jane");
        System.out.println(p.getName());
    }
}
