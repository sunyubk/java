package com.bdqn.sunyu;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("* * * * * * * * *���ѵ�* * * * * * * * *");
		double tshirtPrice=245;
		double tshirtNumber=2;
		System.out.println("������Ʒ\t\t ����\t ����\t  ���\n T��\t"+"\t��"+tshirtPrice+"\t "+tshirtNumber+"\t��"+tshirtPrice*tshirtNumber);
		double shoesPrice=570; 
		double shoseNumber=1;
		System.out.println("����Ь\t\t��"+shoesPrice+"\t "+shoseNumber+"\t��"+shoesPrice*shoseNumber);
		double batPrice=320;
		double batNumber=1;
		System.out.println("������\t\t��"+batPrice+"\t "+batNumber+"\t��"+batPrice*batNumber+"\n\n");
		System.out.print("�ۿۣ�  ");
		int dis=input.nextInt();
		System.out.println("�����ܽ� "+(tshirtPrice*tshirtNumber+shoesPrice*shoseNumber+batPrice*batNumber)*dis/10);
		System.out.print("ʵ�ʽɷѣ�");
		int theActualPayment=input.nextInt();
		System.out.println("��Ǯ�� "+(theActualPayment+-(tshirtPrice*tshirtNumber+shoesPrice*shoseNumber+batPrice*batNumber)*dis/10));
		System.out.println("���ι����õĻ����ǣ� "+(int)((tshirtPrice*tshirtNumber+shoesPrice*shoseNumber+batPrice*batNumber)*dis/10)/30);
		
	}

}
