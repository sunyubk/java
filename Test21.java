package com.bdqn.sunyu;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 0;
		int money=1;
		// String name = "";
		// double price = 0.0;
		System.out.println("MyShopping����ϵͳ>�������");
		System.out.println("****************************************");
		System.out.println("��ѡ�������Ʒ��ţ�");
		System.out.println("1.T��\t2.����Ь\t3.������");
		System.out.println("****************************************");

		String answer = "y";
		while ("y".equals(answer)) {
			System.out.print("��������Ʒ��ţ�");
			num = input.nextInt();
			System.out.print("�����빺��������");
			int numb = input.nextInt();
			switch (num) {
			case 1:
				System.out.println("T��\t��245.0\t������"+numb+"�ϼƣ�"+(numb*245.0));
				break;
			case 2:
				System.out.println("����Ь\t��570.0\t������"+numb+"�ϼƣ�"+(numb*570.0));
				break;
			case 3:
				System.out.println("������\t��320.0\t������"+numb+"�ϼƣ�"+(numb*245.0));
				break;
			}
			System.out.print("�Ƿ����(y/n)");
			answer = input.next();
		}
		System.out.println("�ۿۣ�0.8");
		System.out.println("Ӧ����");
		
	}

}
