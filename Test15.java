package com.bdqn.sunyu;
import java.util.Scanner;


public class Test07{
	public static void main (String[]args){
		Scanner input=new Scanner(System.in);
		System.out.println("\t\t欢迎登陆我行我素购物系统");
		System.out.println("\t\t\t1. 登陆");
		System.out.println("\t\t\t2. 退出");
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * *  ");
		System.out.print("请输入数字：");
		int num=input.nextInt();
		switch (num){
		case 1:
			System.out.println("\t\t\t主菜单");
			System.out.println("\t\t\t11.客户信息管理");
			System.out.println("\t\t\t12.购物结算");
			System.out.println("\t\t\t13.真情回馈");
			System.out.println("\t\t\t14.注销");
			System.out.print("请输入数字：");
			int numa=input.nextInt();
		switch(numa){
		case 11:
			System.out.println("\t\t购物管理系统>客户信息管理");
			System.out.println("\t\t\t111.显示所有客户信息");
			System.out.println("\t\t\t112.添加客户信息");
			System.out.println("\t\t\t113.修改客户信息");
			System.out.println("\t\t\t114.查询客户信息");
			break;
		case 12:
			System.out.println("\t\t\t暂未开发");
			break;
		case 13:
			System.out.println("\t\t购物管理系统>真情回馈");
			System.out.println("\t\t\t131.幸运大放送");
			System.out.println("\t\t\t132.幸运大抽奖");
			System.out.println("\t\t\t133.生日问候");
			break;
		case 14:
			System.out.println("\t\t\t已注销");
			break;
		}
		
			break;
		case 2:
			System.out.print("\t\t\t已退出，欢迎下次光顾！");
			
		}
	}
}
