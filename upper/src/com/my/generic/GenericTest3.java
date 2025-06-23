package com.my.generic;

/* Generic Method
    리턴 타입(void, string,....) 앞에 타입 파라미터를 정의
*/

class Util{
    public static<T> void printArray(T[] ary){
        for(T item : ary){
            System.out.println(item);
        }
    }
}
public class GenericTest3 {
    public static void main(String[] args) {
        String[] names = {"Alice", "Jane", "Bob"};
        Integer[] numbers = {1,2,3,4,5};

        Util.printArray(names);
        Util.printArray(numbers);
    }
}
/*
    와일드 카드
    <?>             아무 타입이나
    <? extends T>   T나 T의 하위 타입만 허용
    <? super T>     T나 T의 상위 타입만 허용
 */