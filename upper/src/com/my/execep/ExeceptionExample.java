package com.my.execep;
// 예외 처리 (try/catch)
/* 일반 예외(Exception) - 컴파일러가 예외 처리 코드 여부를 검사 */

public class ExeceptionExample {
    public static void main(String[] args) {
     /*   try {
            int a = 10;
            int b = 0;
            int result = a / b;
            System.out.println("result : " + result);
        }
        catch(ArithmeticException e)
        {
            System.out.println("0으로 나눌 수 없습니다. ");
        }
        finally     // 정상실행시에도 등장
        {
            System.out.println("프로그램 정상종료");
        }*/
        try {
            int a = 0;
            a = 10;
            int b = 0;

            int result = a / b;
            System.out.println("result : " + result);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
