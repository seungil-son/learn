package com.my.reference;

import java.util.List;
import java.util.LinkedList;
/*
*  LinkedList
*               Method -
                         remove(int index)	인덱스에 해당하는 요소 제거
                         remove(Object o)	해당 객체 제거 (처음 등장하는 것 하나만)
                         removeFirst()	첫 번째 요소 제거
                         removeLast()	마지막 요소 제거
                         clear()	모든 요소 제거
*                        get(int index)	지정된 인덱스의 요소 반환
                         getFirst()	첫 번째 요소 반환
                         getLast()	마지막 요소 반환
                         peek()	첫 요소 반환 (null 반환, 예외 없음)
                         peekFirst()	첫 요소 반환 (peek()과 동일)
                         peekLast()	마지막 요소 반환
*                        poll()	첫 요소 반환 후 제거 (null 반환 가능)
                         pollFirst()	첫 요소 반환 후 제거
                         pollLast()	마지막 요소 반환 후 제거
                         offer(E e)	요소를 리스트의 끝에 추가 (add()와 비슷)
                         offerFirst(E e)	앞에 추가
                         offerLast(E e)	뒤에 추가
                         contains(Object o)	요소 포함 여부 확인
                         size()	요소 개수 반환
                         isEmpty()	비어 있는지 확인
                         indexOf(Object o)	첫 등장 위치 반환
                         lastIndexOf(Object o)	마지막 등장 위치 반환
* */
public class LinkedListTest {
    public static void main(String[] args) {
        List<Number> linkedList = new LinkedList<>();

        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(40);
        System.out.println(linkedList);

        linkedList.add(2,30);
        System.out.println(linkedList);

        System.out.println(linkedList.get(1));

    }
}
