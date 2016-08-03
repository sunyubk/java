package com.bdqn.sunyu;
import java.util.Scanner;

public class Test08 {
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入金额：");
		int money=input.nextInt();
		if (money>50){
		System.out.println("是否参加优惠换购活动： ");
		System.out.println("1：满50元，加2元换购百事可乐饮料一瓶");
		System.out.println("2：满100元，加3元换购500ml可乐一瓶");
		System.out.println("3：满100元，加10元换购5斤面粉");
		System.out.println("4：满200元，加10元可换购1个苏泊尔炒菜锅");
		System.out.println("5：满200元，加20元可换购欧莱雅爽肤水一瓶");
		System.out.println("0：不换购");
		System.out.print("请选择： ");
		int numb=input.nextInt();
		switch (numb){
		case 1:
			System.out.println("本次消费总金额："+(money+2));
			System.out.println("成功换购：百事可乐1瓶");
			break;
		case 2:
			System.out.println("本次消费总金额："+(money+3));
			System.out.println("成功换购：500ml可乐一瓶");
			break;
		case 3:
			System.out.println("本次消费总金额："+(money+10));
			System.out.println("成功换购：5公斤面粉");
			break;
		case 4:
			System.out.println("本次消费总金额："+(money+10));
			System.out.println("成功换购：1个苏泊尔炒菜锅");
			break;
		case 5:
			System.out.println("本次消费总金额："+(money+20));
			System.out.println("成功换购：欧莱雅爽肤水一瓶");
			break;
		case 0:
			System.out.println("已退出");
			break;
			default:
				System.out.println("未开发选项");
		}
		}else{
			System.out.println("孩子钱不够啊！");
		}
	}

}

