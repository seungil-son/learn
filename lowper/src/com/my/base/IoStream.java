package com.my.base;

import java.lang.ref.Cleaner;
import java.util.Scanner;

public class IoStream
{
    public static void main(String[] args)
    {
        /*
        *   표준스트림(java.lang)
        *            표준 출력 스트림 (1) : System.out
        *            표준 입력 스트림 (0) : System.in
        *            표준 에러 스트림 (2) : System.err
        * */
        Scanner sc = new Scanner(System.in); // scanner 객체 생성

        System.out.println();
        System.out.println("input : ");
        String str = sc.nextLine();  //키보드에서 문자를 입력받기위한 변수
        System.out.println(str);


        System.out.println("숫자를 입력하세요 ");
        String str2 = sc.nextLine();  //next()는 버퍼를 지우지 못하고 nextLine()은 버퍼를 지우고 가져온다.
        int n = Integer.parseInt(str2);   //string -> int
        System.out.printf("입력한 숫자는 %d 입니다.", n);



    }
}
