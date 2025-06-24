package com.my.thread;


/* Thread 클래스를 상속하는 자식 익명 객체 생성 */
public class ThreadTest2 {
    public static void main(String[] args) {
        Thread thread = new Thread(){
          @Override
          public void run() {
              System.out.println("thread running");
          }
        };
        thread.start();
    }
}
