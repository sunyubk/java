package com.bdqn.sunyu;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("������һ������(����0ʱ����)�� ");
		double num = input.nextDouble();
		double max = 0;
		double min = 0;
		while (num > 0) {
			if(num>max){
				max=num;
			}
			if(num<min){
				min=num;
			}
			if(min==0){
				min=num;
			}
			System.out.print("������һ������(����0ʱ����)�� ");
			num = input.nextDouble();
			}
		System.out.println("���ֵΪ��" + max);
		System.out.println("��СֵΪ��" + min);
	}

}
