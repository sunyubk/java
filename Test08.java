package com.bdqn.sunyu;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("* * * * * * * * *消费单* * * * * * * * *");
		double tshirtPrice=245;
		double tshirtNumber=2;
		System.out.println("购买物品\t\t 单价\t 个数\t  金额\n T恤\t"+"\t￥"+tshirtPrice+"\t "+tshirtNumber+"\t￥"+tshirtPrice*tshirtNumber);
		double shoesPrice=570; 
		double shoseNumber=1;
		System.out.println("网球鞋\t\t￥"+shoesPrice+"\t "+shoseNumber+"\t￥"+shoesPrice*shoseNumber);
		double batPrice=320;
		double batNumber=1;
		System.out.println("网球拍\t\t￥"+batPrice+"\t "+batNumber+"\t￥"+batPrice*batNumber+"\n\n");
		System.out.print("折扣：  ");
		int dis=input.nextInt();
		System.out.println("消费总金额： "+(tshirtPrice*tshirtNumber+shoesPrice*shoseNumber+batPrice*batNumber)*dis/10);
		System.out.print("实际缴费：");
		int theActualPayment=input.nextInt();
		System.out.println("找钱： "+(theActualPayment+-(tshirtPrice*tshirtNumber+shoesPrice*shoseNumber+batPrice*batNumber)*dis/10));
		System.out.println("本次购物获得的积分是： "+(int)((tshirtPrice*tshirtNumber+shoesPrice*shoseNumber+batPrice*batNumber)*dis/10)/30);
		
	}

}
