package com.my.generic;

/* Generic Class */
class Box<T>{               // T 타입을 대표로 주고 실핼할때 타입을 결정함 (타입 결정 유예)
    private T value;                // 타입 파라미터

    public void setValue(T value){
        this.value=value;
    }
    public T getValue(){
        return value;
    }

}
public class GenericTest2 {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setValue("뿌뿌");
        System.out.println(stringBox.getValue());

        Box<Integer> integerBox = new Box<>();

        integerBox.setValue(33);
        System.out.println(integerBox.getValue());
    }
}
