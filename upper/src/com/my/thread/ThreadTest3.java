package com.my.thread;

/* 3. Runnable 인터페이스 사용 */

class Task implements Runnable {
    @Override
    public void run() {
        System.out.println("Interface thread running");
    }
}

public class ThreadTest3 {
    public static void main(String[] args) {
       Runnable task = new Task();
       task.run();                              // Runnable 구현 객체 : Runnable 인터페이스를 사용해서 task.start();를 사용할 필요 없다.

        Task task1 = new Task();
        Thread thread = new Thread(task1);      // thread 생성자 매개값으로 구현 객체 전달
        thread.start();

    }
}
