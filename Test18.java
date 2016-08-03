package com.bdqn.sunyu;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("请输入一个整数(输入0时结束)： ");
		double num = input.nextDouble();
		double max = 0;
		double min = 0;
		while (num > 0) {
			if(num>max){
				max=num;
			}
			if(num<min){
				min=num;
			}
			if(min==0){
				min=num;
			}
			System.out.print("请输入一个整数(输入0时结束)： ");
			num = input.nextDouble();
			}
		System.out.println("最大值为：" + max);
		System.out.println("最小值为：" + min);
	}

}
