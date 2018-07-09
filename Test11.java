package com.bdqn.sunyu;
import java.util.Scanner;
public class Test03 {
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.println("票价为：");
		int money=input.nextInt();
		System.out.println("出行月份：");
		int day=input.nextInt();
		switch(day%10){
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 0:
			System.out.println("旺季");
			break;
		case 1:
		case 2:
		case 3:

		case 12:
			System.out.println("淡季");
			break;
			//default:
		}
				
				System.out.println("请问您选择头等舱还是经济舱？  (头等舱请按1，经济舱请按2)");
				int num=input.nextInt();
				if(num==1){
					System.out.println("您选择的是头等舱");
					
					
				}else if(num==2){
					System.out.println("您选择的是经济舱");
				}
			
				if(day<=10&&day>=4&&num==1){
					System.out.println("打折后价格： "+money*0.9);
				}else if(day<=10&&day>=4&&num==2){
					System.out.println("打折后价格： "+money*0.8);
				}else if((day==1||day==2||day==3||day==11||day==12)&&num==1){
					System.out.println("打折后价格： "+money*0.5);
				}else if((day==1||day==2||day==3||day==11||day==12)&&num==2){
					System.out.println("打折后价格： "+money*0.4);
	}
	}
}
