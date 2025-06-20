package com.my.poly.casting;

class Base {
    public void method1() {
        System.out.println("method1 in Base Class");
    }
    public void method3(){
        System.out.println("Overring Base");
    }
}
class Derived extends  Base{
    public void method2(){
        System.out.println("method2 in Derived");
    }
    @Override
    public void method3(){
        System.out.println("Overriding - Derived");
    }
}

public class CastingMain {
    public static void main(String[] args) {

        System.out.println("-- Base 함수 호출 --");
        Base b = new Base();
        b.method1();
        b.method3();
        System.out.println();

        System.out.println("-- Derived 함수 호출 --");
        Derived d = new Derived();
        d.method2();
        d.method3();
        d.method1();
        System.out.println();

        System.out.println("-- UpCasting --");
        Base obj = new Derived();       // UpCasting (자동 형 변환)
        obj.method3();
        obj.method1();
        System.out.println();

     /*
        Derived d2 = (Derived) obj;  // DownCasting 강제 형 변환 (가급적 회피할것)
        d2.method2();
        d2.method3();
        d2.method1();
*/
        // DownCasting 해야만 할 때
        System.out.println("-- DownCasitng --");
        if(obj instanceof Derived d2)  // 안전한 DownCasting
        {
            d2.method1();
            d2.method3();
            d2.method2();
        }

    }
}
/*
  출력 결과

-- Base 함수 호출 --
method1 in Base Class
Overring Base

-- Derived 함수 호출 --
method2 in Derived
Overriding - Derived
method1 in Base Class

-- UpCasting --
Overriding - Derived
method1 in Base Class

-- DownCasitng --
method1 in Base Class
Overriding - Derived
method2 in Derived

 */
