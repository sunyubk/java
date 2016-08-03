package com.bdqn.sunyu;
import java.util.Scanner;

public class Test01 {
	public static void main (String[]args){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入星期几：");
		int day=input.nextInt();
		switch(day){
		case 1:
		case 3:
		case 5:
			System.out.println("学习编程");
			break;
		case 2:
		case 4:
		case 6:
			System.out.println("学习英语");
			break;
		default:
			System.out.println("休息");
			break;
		}
		
	}

}
