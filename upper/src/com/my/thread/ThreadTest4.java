package com.my.thread;

/* 4. thread 생성자 호출 시 매개값으로 runnable 익명 구현 객체 사용 */


public class ThreadTest4 {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("익명 구현 객체 Thread");
            }
        });
        thread.start();
        System.out.println(thread.getName());  // thread-n 형식으로 default 이름이 주어진다.
        thread.setName("thr");
        System.out.println(thread.getName());
    }
}