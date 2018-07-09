package com.bdqn.sunyu;
import java.util.Scanner;

public class Test05 {
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入第一个操作数：");
		if(input.hasNextInt()==true);
		double num=input.nextDouble();
		System.out.println("请输入第二个操作数：");
		double num2=input.nextDouble();
		System.out.println("请选择操作符号：+，-，*，/");
		char num3=(char)input.next().toString().charAt(0);
		switch(num3){
		case '+':
			System.out.println("计算结果： "+(num+num2));
			break;
		case '-':
			System.out.println("计算结果： "+(num-num2));
			break;
		case '*':
			System.out.println("计算结果： "+(num*num2));
			break;
		case '/':
			System.out.println("计算结果： "+(num/num2));
			break;
		}
	}
	

}
