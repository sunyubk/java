package com.bdqn.sunyu;
import java.util.Scanner;

public class Test01 {
	public static void main (String[]args){
		Scanner input=new Scanner(System.in);
		System.out.print("���������ڼ���");
		int day=input.nextInt();
		switch(day){
		case 1:
		case 3:
		case 5:
			System.out.println("ѧϰ���");
			break;
		case 2:
		case 4:
		case 6:
			System.out.println("ѧϰӢ��");
			break;
		default:
			System.out.println("��Ϣ");
			break;
		}
		
	}

}
