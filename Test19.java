package com.bdqn.sunyu;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		
		Boolean isover=true;
		while (isover) {
			System.out.print("请输入数字1-7(输入0时结束)");
			Scanner input = new Scanner(System.in);
			int num;
			if (input.hasNextInt()) {
				num = input.nextInt();
				switch (num) {
				case 0:
					isover=false;
					System.out.println("程序结束");
					break;
				case 1:
					System.out.println("今天是：Mon");
					break;
				case 2:
					System.out.println("今天是：Tue");
					break;
				case 3:
					System.out.println("今天是：Wed");
					break;
				case 4:
					System.out.println("今天是：Thu");
					break;
				case 5:
					System.out.println("今天是：Fri");
					break;
				case 6:
					System.out.println("今天是：Sat");
					break;
				case 7:
					System.out.println("今天是：Sun");
					break;
				}
			} else {
				System.out.println("请重新输入");
			}
		}

	}
}
