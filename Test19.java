package com.bdqn.sunyu;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		
		Boolean isover=true;
		while (isover) {
			System.out.print("����������1-7(����0ʱ����)");
			Scanner input = new Scanner(System.in);
			int num;
			if (input.hasNextInt()) {
				num = input.nextInt();
				switch (num) {
				case 0:
					isover=false;
					System.out.println("�������");
					break;
				case 1:
					System.out.println("�����ǣ�Mon");
					break;
				case 2:
					System.out.println("�����ǣ�Tue");
					break;
				case 3:
					System.out.println("�����ǣ�Wed");
					break;
				case 4:
					System.out.println("�����ǣ�Thu");
					break;
				case 5:
					System.out.println("�����ǣ�Fri");
					break;
				case 6:
					System.out.println("�����ǣ�Sat");
					break;
				case 7:
					System.out.println("�����ǣ�Sun");
					break;
				}
			} else {
				System.out.println("����������");
			}
		}

	}
}
