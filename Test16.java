package com.bdqn.sunyu;
import java.util.Scanner;

public class Test08 {
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.print("�������");
		int money=input.nextInt();
		if (money>50){
		System.out.println("�Ƿ�μ��Żݻ������ ");
		System.out.println("1����50Ԫ����2Ԫ�������¿�������һƿ");
		System.out.println("2����100Ԫ����3Ԫ����500ml����һƿ");
		System.out.println("3����100Ԫ����10Ԫ����5�����");
		System.out.println("4����200Ԫ����10Ԫ�ɻ���1���ղ������˹�");
		System.out.println("5����200Ԫ����20Ԫ�ɻ���ŷ����ˬ��ˮһƿ");
		System.out.println("0��������");
		System.out.print("��ѡ�� ");
		int numb=input.nextInt();
		switch (numb){
		case 1:
			System.out.println("���������ܽ�"+(money+2));
			System.out.println("�ɹ����������¿���1ƿ");
			break;
		case 2:
			System.out.println("���������ܽ�"+(money+3));
			System.out.println("�ɹ�������500ml����һƿ");
			break;
		case 3:
			System.out.println("���������ܽ�"+(money+10));
			System.out.println("�ɹ�������5�������");
			break;
		case 4:
			System.out.println("���������ܽ�"+(money+10));
			System.out.println("�ɹ�������1���ղ������˹�");
			break;
		case 5:
			System.out.println("���������ܽ�"+(money+20));
			System.out.println("�ɹ�������ŷ����ˬ��ˮһƿ");
			break;
		case 0:
			System.out.println("���˳�");
			break;
			default:
				System.out.println("δ����ѡ��");
		}
		}else{
			System.out.println("����Ǯ��������");
		}
	}

}

