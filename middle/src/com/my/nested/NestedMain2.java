package com.my.nested;

class Outer{
    class Inner{
        int innerField = 11;

        void innerMethod(){
            System.out.printf("innerField %d\n", innerField);
        }
    }
}
public class NestedMain2 {
}
