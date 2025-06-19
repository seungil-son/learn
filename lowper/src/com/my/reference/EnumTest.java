package com.my.reference;

public class EnumTest {
    String a = "AMERICANO";
    enum CoffeeType { // enum 열거형 타입의 자료형
        AMERICANO,
        ICE_AMERICANO,
        CAFE_LATTE
    }
    public static void main(String[] args) {
        System.out.println(CoffeeType.AMERICANO);
        System.out.println(CoffeeType.ICE_AMERICANO);
        System.out.println(CoffeeType.CAFE_LATTE);
        System.out.println();

        for(CoffeeType t : CoffeeType.values())
        {
            System.out.println(t);
        }
    }

}
