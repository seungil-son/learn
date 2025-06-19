package com.my.base;
import java.util.Scanner;
public class IoStream2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("입력하세요 : ");

        byte b = sc.nextByte(); // byte타입의 입력
        short s= sc.nextShort(); // short타입 입력
        int i = sc.nextInt(); // 정수타입의 입력
        double d = sc.nextDouble(); // 실수타입의 입력
        char c = sc.next().charAt(0); // 문자 타입의 입력

        String str = sc.next();  // 공백을 기준으로 읽어옴
        String str2 = sc.nextLine(); // 개행(줄바꿈문자(enter))을 기준으로 읽어옴

        sc.close(); //명시적으로 입력 스트림을 닫는다.




    }
}
