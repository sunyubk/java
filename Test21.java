package com.bdqn.sunyu;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 0;
		int money=1;
		// String name = "";
		// double price = 0.0;
		System.out.println("MyShopping管理系统>购物结算");
		System.out.println("****************************************");
		System.out.println("请选择购买的商品编号：");
		System.out.println("1.T恤\t2.网球鞋\t3.网球拍");
		System.out.println("****************************************");

		String answer = "y";
		while ("y".equals(answer)) {
			System.out.print("请输入商品编号：");
			num = input.nextInt();
			System.out.print("请输入购买数量：");
			int numb = input.nextInt();
			switch (num) {
			case 1:
				System.out.println("T恤\t￥245.0\t数量："+numb+"合计："+(numb*245.0));
				break;
			case 2:
				System.out.println("网球鞋\t￥570.0\t数量："+numb+"合计："+(numb*570.0));
				break;
			case 3:
				System.out.println("网球拍\t￥320.0\t数量："+numb+"合计："+(numb*245.0));
				break;
			}
			System.out.print("是否继续(y/n)");
			answer = input.next();
		}
		System.out.println("折扣：0.8");
		System.out.println("应付金额：");
		
	}

}
