package com.bdqn.sunyu;
import java.util.Scanner;

public class Test05 {
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.println("�������һ����������");
		if(input.hasNextInt()==true);
		double num=input.nextDouble();
		System.out.println("������ڶ�����������");
		double num2=input.nextDouble();
		System.out.println("��ѡ��������ţ�+��-��*��/");
		char num3=(char)input.next().toString().charAt(0);
		switch(num3){
		case '+':
			System.out.println("�������� "+(num+num2));
			break;
		case '-':
			System.out.println("�������� "+(num-num2));
			break;
		case '*':
			System.out.println("�������� "+(num*num2));
			break;
		case '/':
			System.out.println("�������� "+(num/num2));
			break;
		}
	}
	

}
