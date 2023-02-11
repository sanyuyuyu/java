package cn.cxy.exec;

import java.util.Scanner;
public class TestNum {
	public static void main(String[] args) 
{
		System.out.println("请输入您要判断的数据");
		int input = new Scanner(System.in).nextInt();
		if(input % 2 == 0)
                {
			System.out.println(input+"是偶数");
		}
                else
                {
			System.out.println(input+"是奇数");
		}
	}
}


