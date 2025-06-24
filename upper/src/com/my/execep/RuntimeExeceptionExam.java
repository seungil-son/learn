package com.my.execep;

/* 실행 예외 */

public class RuntimeExeceptionExam {
    public static void main(String[] args) {

        String str = null;
        try{
            System.out.println("문자열 길이 : "+ str.length());
        } catch (NullPointerException e){
            System.out.println("예외 발생 : 문자열이 null입니다.");
        }

        String str2 = "12345a";
        int res = 0;

        try {
            res = Integer.parseInt(str2);
            System.out.println("변환된 숫자 : " + res);
        } catch (NumberFormatException e) {
            System.out.println("예외 발생 : 숫자 형식이 올바르지않습니다.");
        }
    }
}
