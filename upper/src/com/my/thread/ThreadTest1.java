package com.my.thread;


/*  스레드(Thread)
        1. 멀티 프로세서는 프로그램 단위의 멀티태스킹이고, 멀티 스레드는 프로그램 내부의멀티 태스킹이다.
        2. Thread 클래스를 사옥하여 thread 생성
*/


class MyThread extends Thread{
    public void run(){
        System.out.println("thread running");
    }

}

public class ThreadTest1 {
    public static void main(String[] args) {
        Thread thread = new MyThread();
        thread.start();  // run() Method 실행
    }
}
