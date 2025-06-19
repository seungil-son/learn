package com.my.reference;

public class ArrayTest2 {
    public static void main(String[] args)
    {
        int[] nums = null;
        nums = new int[]{10, 20, 30, 40};
        int sum = 0;
        int num;
        num = 10;

        for (int i = 0; i < nums.length; i++)
        {
            sum += nums[i];
        }
        System.out.println("for문 : "+ sum);
        sum =0;

        for(int n : nums)
        {
            sum += n;
        }
        System.out.println("forEach문 : " + sum);
        sum = 0;

        int result = add(nums);
        System.out.println("add함수 : "+result);
    }
    public static int add( int[] ary)
    {   // add 메소드
        int res = 0;
        for(int n : ary)
        {
            res +=n;
        }
         return res;
    }
}
