package com.my.nested;

/*
    동일한 이름일 때 바깥 멤버에 접근법(this)
 */
class MyClass{
    String str = "MyClass str";

    void show() {
        System.out.println(str);
    }
    class Inner{
        String str = "InnerClass str";

        void show(){
            System.out.println(str);
        }
        void show2(){
            this.show();
            MyClass.this.show();
        }
    }
}

public class NestedMain4 {
    public static void main(String[] args) {
        MyClass obj = new MyClass();

        obj.show();
        System.out.println("----");

        MyClass.Inner in = obj.new Inner();
        in.show();
        System.out.println("----");
        in.show2();
    }
}
/*
    출력
    MyClass str
    ----
    InnerClass str
    ----
    InnerClass str
    MyClass str

 */
