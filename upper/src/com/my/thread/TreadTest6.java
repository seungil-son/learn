package com.my.thread;

/* 동기화(synchronized)
       같은 변수를 사용하는 Thread 들의 접근을 한가지 Thread의 연산이 끝난 뒤에 다음 연산을 실행하도록 변경한다.
       사용하는 변수가 같을때 다른 Thread가 연산 완료되기 전에 변경하고 저장한 변수의 값을 또 다른 Thread가 가져와서 사용한다.
       결과 의도한 값이 나오지 않는다.
 */

class MyClass {
    private int count = 0;
    // 메서드 동기화 - 임계영역을 감싼다.
    public synchronized void increment(){
        count++;
    }
    public synchronized void decrement(){
        count--;
    }
    public void getCount(){
        System.out.println("count " + count);
    }
}
public class TreadTest6 {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<100000;i++){
                    obj.increment();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i<100000; i++)
                {
                    obj.decrement();
                }
            }
        });
        obj.getCount();     // Thread 실행 전 count
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        obj.getCount();     //Thread 실행 후 count
    }
}
