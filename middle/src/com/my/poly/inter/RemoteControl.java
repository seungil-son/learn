package com.my.poly.inter;

public interface RemoteControl {
    public void turnOn();       // 추상 메서드

}
// 구현 클래스
    class Television implements RemoteControl{  // Interface의 상속은 implements
     @Override
      public void turnOn(){
        System.out.println("TV On");
     }
    }

    class Radio implements RemoteControl {
      @Override
      public void turnOn() {
         System.out.println("Radio On");
      }
    }