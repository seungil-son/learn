package com.my.execep;

/* 사용자 정의 예외 클래스
    throws : 던지는 역활
    throw : 예외 발생
 */

class AgeUnder18Exception extends Exception{
    public AgeUnder18Exception(String message){
        super(message);             // 부모 생성자 호출(super)
    }
}

public class ExeceptionExample2 {
    //throws는 호출한 곳으로 예외를 던진다. (AgeUnder18Exception)
    public static void checkAge(int age) throws AgeUnder18Exception {
        if(age<18){
            throw new AgeUnder18Exception("미성년자 입니다.");
        } else{
            System.out.println("통과");
        }
    }

    public static void main(String[] args) throws AgeUnder18Exception {
        int useAge = 16;

        try {
            checkAge(useAge);
        } catch (AgeUnder18Exception e) {
            System.out.println("예외 처리 : "+e.getMessage());
        }
    }
}
