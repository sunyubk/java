package com.bdqn.sunyu;
import java.util.Scanner;
public class Test03 {
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.println("Ʊ��Ϊ��");
		int money=input.nextInt();
		System.out.println("�����·ݣ�");
		int day=input.nextInt();
		switch(day%10){
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 0:
			System.out.println("����");
			break;
		case 1:
		case 2:
		case 3:

		case 12:
			System.out.println("����");
			break;
			//default:
		}
				
				System.out.println("������ѡ��ͷ�Ȳջ��Ǿ��òգ�  (ͷ�Ȳ��밴1�����ò��밴2)");
				int num=input.nextInt();
				if(num==1){
					System.out.println("��ѡ�����ͷ�Ȳ�");
					
					
				}else if(num==2){
					System.out.println("��ѡ����Ǿ��ò�");
				}
			
				if(day<=10&&day>=4&&num==1){
					System.out.println("���ۺ�۸� "+money*0.9);
				}else if(day<=10&&day>=4&&num==2){
					System.out.println("���ۺ�۸� "+money*0.8);
				}else if((day==1||day==2||day==3||day==11||day==12)&&num==1){
					System.out.println("���ۺ�۸� "+money*0.5);
				}else if((day==1||day==2||day==3||day==11||day==12)&&num==2){
					System.out.println("���ۺ�۸� "+money*0.4);
	}
	}
}
