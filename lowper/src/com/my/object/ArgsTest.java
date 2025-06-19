package com.my.object;

/*
    가변길이 매개변수 : 동일한 타입
*/

class ArgsClass{

  /*  void paramf(int...values){  // 가변길이 매개변수
        for(int i=0; i < values.length; i++)
        {
            System.out.println(values[i]);
        }
    }*/
    void paramf(int[] values){
        for(int i=0; i < values.length; i++)
        {
            System.out.println(values[i]);
        }
    }
}

public class ArgsTest {
    public static void main(String[] args) {
        ArgsClass obj = new ArgsClass();
        int i = 4, i2 = 55;

        //obj.paramf(1, 2, 3, i , i2);

        int[] ary = {1,2,3,4,55};
        obj.paramf(ary);
    }
}
