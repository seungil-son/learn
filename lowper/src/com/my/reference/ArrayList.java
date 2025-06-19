package com.my.reference;
import java.util.List;

/* List - 배열과 반대로 데이터 추가, 삭제가 빠르다. 검색이 늦다. 포인터로 연결한 구조

*    ArrayList :
*               method -  add(E e)	요소를 리스트의 끝에 추가
                          add(int index, E element)	특정 위치에 요소 삽입
                          get(int index)	지정한 인덱스의 요소 반환
                          set(int index, E element)	지정한 위치의 요소를 다른 값으로 변경
                          remove(int index)	인덱스의 요소를 삭제
                          remove(Object o)	특정 객체를 찾아 삭제
                          clear()	리스트의 모든 요소 삭제 (비움)
                          size()	리스트에 저장된 요소의 개수 반환
                          isEmpty()	리스트가 비어 있는지 확인
                          contains(Object o)	특정 요소가 리스트에 포함되어 있는지 확인
                          indexOf(Object o)	특정 요소의 첫 인덱스 반환 (없으면 -1)
                          lastIndexOf(Object o)	특정 요소의 마지막 인덱스 반환
                          toArray()	리스트를 배열로 변환
                          iterator()  리스트의 요소를 반복할 수 있는 이터레이터 반환
*
*/
public class ArrayList
{
    public static void main(String[] args)
    {
        List<String> arrayList = new java.util.ArrayList<>(); // import java.util.List;
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("D");
        System.out.println(arrayList);

        arrayList.add(2, "C");
        System.out.println(arrayList);
    }
}
