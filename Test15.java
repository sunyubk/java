package com.bdqn.sunyu;
import java.util.Scanner;


public class Test07{
	public static void main (String[]args){
		Scanner input=new Scanner(System.in);
		System.out.println("\t\t��ӭ��½�������ع���ϵͳ");
		System.out.println("\t\t\t1. ��½");
		System.out.println("\t\t\t2. �˳�");
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * *  ");
		System.out.print("���������֣�");
		int num=input.nextInt();
		switch (num){
		case 1:
			System.out.println("\t\t\t���˵�");
			System.out.println("\t\t\t11.�ͻ���Ϣ����");
			System.out.println("\t\t\t12.�������");
			System.out.println("\t\t\t13.�������");
			System.out.println("\t\t\t14.ע��");
			System.out.print("���������֣�");
			int numa=input.nextInt();
		switch(numa){
		case 11:
			System.out.println("\t\t�������ϵͳ>�ͻ���Ϣ����");
			System.out.println("\t\t\t111.��ʾ���пͻ���Ϣ");
			System.out.println("\t\t\t112.��ӿͻ���Ϣ");
			System.out.println("\t\t\t113.�޸Ŀͻ���Ϣ");
			System.out.println("\t\t\t114.��ѯ�ͻ���Ϣ");
			break;
		case 12:
			System.out.println("\t\t\t��δ����");
			break;
		case 13:
			System.out.println("\t\t�������ϵͳ>�������");
			System.out.println("\t\t\t131.���˴����");
			System.out.println("\t\t\t132.���˴�齱");
			System.out.println("\t\t\t133.�����ʺ�");
			break;
		case 14:
			System.out.println("\t\t\t��ע��");
			break;
		}
		
			break;
		case 2:
			System.out.print("\t\t\t���˳�����ӭ�´ι�ˣ�");
			
		}
	}
}
