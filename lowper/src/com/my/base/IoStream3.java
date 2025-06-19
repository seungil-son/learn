package com.my.base;

import java.util.Scanner;

public class IoStream3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("Input Number : "); // printf는 println과 다르게 자동 줄바꿈이 없다.
        int age = sc.nextInt();  // 버퍼에 enter가 남아있다.
        sc.nextLine();  // nextLine()를 호출함으로써 버퍼에 저장된 enter를 가져온다.

        System.out.printf("Input Name : ");
        String name = sc.nextLine();  // 남아있던 enter까지 가져온다.

        System.out.println("Output Number : "+ age);
        System.out.println("Output Name : "+ name);

        sc.close();

    }
}
