package com.my.reference;

/* 참조타입 : 배열, 열거, 클래스, 인터페이스 */
public class ArrayTest {
    public static void main(String[] args) {
        /*
        * 배열(Array)의 특징 : 동일한 자료형의 연속적인 집합, 검색이 빠르다, 중간데이터의 추가와 삭제가 어렵다
        * 리스트(List)의 특징 : 동일한 자료형의 연속적인 집합,
        *                     원소를 삭제했을 때 삭제된 데이터 뒤 원소로 빈틈없이 연속적으로 위치시킨다.(삽입,삭제 쉬움),
        *                     검색이 어렵다.

        * */
        int[] arr = {1, 2, 3, 4, 5}; // 배열 선언과 함께 초기화
        int[] arr2 = new int[]{11, 22, 33, 44, 55};  // 명시적 배열 객체 생성

        int[] arr3 = null; // 동적으로 배열생성
        arr3 = new int[]{12, 13, 14}; //초기화 이후 값 삽입

        int[] arr4 = new int[4];  //배열을 4개 생성하고 0으로 초기화

        System.out.printf("arr 배열 : ");
        for(int i = 0; i < arr.length ; i++)
        {
            System.out.printf("%d ", arr[i]);
        }
        System.out.println();

        System.out.printf("arr2 배열 : ");
        for(int i = 0; i < arr2.length ; i++)
        {
            System.out.printf("%d ", arr2[i]);
        }
        System.out.println();

        System.out.printf("arr3 배열 : ");
        for(int i = 0; i < arr3.length ; i++)
        {
            System.out.printf("%d ", arr3[i]);
        }
        System.out.println();

        System.out.printf("arr4 배열 : ");
        for(int i = 0; i < arr4.length; i++)
        {
            System.out.printf("%d ", arr4[i]);
        }
        System.out.println();

        //문자와 배열 동적할당
        String[] strAry = new String[3];
        strAry[0] = "Java";
        strAry[1] = "Java";
        strAry[2] = new String("Java");

        System.out.println(strAry[0]== strAry[1]); // true
        System.out.println(strAry[1] == strAry[2]); // false
        System.out.println(strAry[1].equals(strAry[2])); //true

        System.out.println(arr);   //배열이름을 출력([I@1be6f5c3) 일종의 해쉬코드
        System.out.println(arr2);
        System.out.println(arr3);

        for(int i = 0; i < strAry.length; i++)
        {
            System.out.println(strAry[i]);
        }

        // 향상된 for문 (forEach)
        // 인덱스 접근이 안된다.
        System.out.println();
        for(String s: strAry){ // 배열의 값을 하나씩 s에 넣어라
            System.out.println(s);
        }
    }
}
