package com.bdqn.sunyu;
import java.util.Scanner;

public class Test02 {
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.print("���Գɼ��� ");
		int javaScore=input.nextInt();
		switch (javaScore/10){
		case 10:
			System.out.println("���׸���������");
			break;
		case 9:
			System.out.println("ĸ�׸������ʼǱ�����");
			break;
		case 8:
			System.out.println("ĸ�׸�����һ���ֻ�");
			break;
		case 7:
			System.out.println("ĸ�׸�����һ���ֻ�");
			break;
		case 6:
			System.out.println("ĸ�׸�����һ���ֻ�");
			break;
			
		
		default:
			System.out.println("û������");
	
				
			
			
		
		}
	}

}
