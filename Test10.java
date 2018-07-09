package com.bdqn.sunyu;
import java.util.Scanner;

public class Test02 {
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.print("考试成绩： ");
		int javaScore=input.nextInt();
		switch (javaScore/10){
		case 10:
			System.out.println("父亲给她买辆车");
			break;
		case 9:
			System.out.println("母亲给她部笔记本电脑");
			break;
		case 8:
			System.out.println("母亲给他买一部手机");
			break;
		case 7:
			System.out.println("母亲给他买一部手机");
			break;
		case 6:
			System.out.println("母亲给他买一部手机");
			break;
			
		
		default:
			System.out.println("没有礼物");
	
				
			
			
		
		}
	}

}
