package com.my.nested;

import java.util.Scanner;

/* 중첩 인터페이스*/
class Button {

    public static interface ClickListener{
        public void onClick();                  //추상 메서드

    }
    private  ClickListener clickListener;
    public void setClickListener(ClickListener clickListener){
        this.clickListener = clickListener;
    }
    public void click(){
        this.clickListener.onClick();
    }


}

public class NewstedMain5 {
    public static void main(String[] args) {
        Button ok = new Button();
        Button cancel = new Button();

        class OKListener implements Button.ClickListener {
            @Override
            public void onClick() {                              // 추상 메서드 재정의
                System.out.println("OK On Clicked");
            }
        }

        ok.setClickListener(new OKListener());                  //
        ok.click();

        class CancelListener implements Button.ClickListener{
            @Override
            public void onClick(){
                System.out.println("Cancel Clicked");
            }
        }

        cancel.setClickListener((new CancelListener()));
        cancel.click();
    }
}
