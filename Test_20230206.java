package com.itranswarp.learnjava;
import jaba.util.*;

class Test_20230206
{
    public static void main(String[] args)
    {
        //ArrayList可以看作：“可变长度”的数组
        //ArrayList内部就是一个Object[]数组，配合存储一个当前分配的长度，就可以充当“可变数组”
        /*private Object[] array;
        private int size;
        public void add(Object e) {...}
        public void remove(int index) {...}
        public Object get(int index) {...}
        */

        // 构造从start到end的序列：

        final int start = 10;
        final int end = 20;
        List<Integer> list = new ArrayList<>();
        for (int i = start; i <= end; i++) 
        {
             list.add(i);
        }

        // 洗牌算法suffle可以随机交换List中的元素位置:

        Collections.shuffle(list);
        // 随机删除List中的一个元素:
        int removed = list.remove((int) (Math.random() * list.size()));
        int found = findMissingNumber(start, end, list);
        System.out.println(list.toString());
        System.out.println("missing number: " + found);
        System.out.println(removed == found ? "测试成功" : "测试失败");


    }

    static int findMissingNumber(int start, int end, List<Integer> list) 
    {
        for(int i = 10; i < 21; i++) 
        {
        if(!list.contains((Integer) i)) 
        {
        return i;
        }
        return end;
        }

    }


 }