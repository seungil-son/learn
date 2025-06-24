package com.my.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* 스레드풀 :  - 자원관리 목적
              - 매번 스레드를 생성하면 비용과 자원 낭비가 크다. 또한 성능이 저하된다.
              - 미리 고정된 수의 스레드를 생성해서 사용, 풀에 보관하여 작업이 생기면 재 사용한다.
              - 자바는 ExecutorService 인터페이스로 스레드풀을 제공한다.
              - newFixedThreadPool(n) : 고정크기의 스레드 풀
              - newCachedThreadPool() : 필요시에 생성, 사용안하면 제거
              - newSingleThreadExecutor() : 단일 스레드 순차 실행
              - newScheduledThreadPool(n) : 주기적 실행
 */

public class ThreadPool {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);  //스레드 3개의 고정 크기를 가지는 스레드풀을 생성하겠다.
        //3개의 스레드를 저장해두고 작업이 생기면 저장해둔 스레드를 꺼내서 사용한다
        for(int i = 1; i<=3; i++)
        {
            int taskId = i;
            executor.submit(()->{           // submit() 작업을 제출한다.
                System.out.printf("작업 : %d 시작 : %s\n",taskId,Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.printf("작업 : %d 완료",taskId);
                }
            });
        }
        executor.shutdown();        // 모든 작업 종료
    }
}
