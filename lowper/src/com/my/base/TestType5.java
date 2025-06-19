package com.my.base;

public class TestType5 {
    public static void main(String[] args) {
        String str = "let's learn Java"; //heap 영영의 string constant pool
        String str2 = "let's learn Java";

        System.out.println();
        System.out.println(System.identityHashCode(str));
        System.out.println(System.identityHashCode(str2));
        //동일한 값이기 때문에 str과 str2는 동일한 해쉬코드를 가진다.
        System.out.println();

        String str3 = new String("let's learn Java"); //heap 영역에 저장
        String str4 = new String("let's learn Java");
        System.out.println(System.identityHashCode(str3));
        System.out.println(System.identityHashCode(str4));


    }
}
