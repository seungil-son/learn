package com.my.inher;

/*
    상속 - 코드의 재사용성, 유지보수
    상속된 자식객체를 생성하면 부모 생성자도 호출된다.(super())
    디폴트 부모 생성자는 자동으로 호출되며 명시적으로 생성자를 작성한 경우
    매개변수 타입과 개수가 일치하는 부모생성자를 호출한다.
 */

public class SubInit extends SuperInit {
    String code;

    public SubInit(String country, String city, String code){
        //super();  // 부모 생성자 호출, 생략가능
        this.country = country;
        this.city = city;
        this.code = code;

        System.out.println("SubClass Constructor");

    }
}
