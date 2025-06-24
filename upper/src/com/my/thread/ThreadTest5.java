package com.my.thread;

/*  */


/* 멀티 스레드 실행 순서 */
public class ThreadTest5 extends Thread{
    @Override
    public void run() {
        super.run();
        System.out.println(getName() + "   thread start");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(getName() + "   thread stop");
    }

    public static void main(String[] args) {
        for(int i = 0; i<10;i++)
        {
            Thread thread = new ThreadTest5();
            // thread.setDaemon(true);  // Main Thread가 종료될 때 생성했던 Thread를 종료
            thread.start();

            /* join() 메서드는 실행 메서드가 끝날때 까지 메인 메서드를 기다린다. */
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("MainThread end");

    }
}
