package com.bdqn.sunyu;

public class Test04 {
	public static void main(String[]args){
		int sum=0;
		int num=2;
		while(num<=100){
			sum=sum+num;
			num=num+2;
		}
		System.out.println("100以内的偶数只和为："+sum);
	}

}
