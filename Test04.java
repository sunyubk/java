package com.bdqn.sunyu;

import java.util.Scanner;


public class Test01 {

	 public static void main(String[] args) {
		 Scanner input=new Scanner(System.in);
		 System.out.print("STB�ĳɼ��ǣ�");
		 int stbScore=input.nextInt();
		 System.out.print("Java�ĳɼ��� ");
		 int javaScore=input.nextInt();
		 System.out.print("SQL�ĳɼ��ǣ� ");
		 int sqlScore=input.nextInt();
		 System.out.println("- - - - - - - - - - - - - - - - - - - - ");
		 System.out.println("SBT\tJava\tSQL\n "+stbScore+"\t "+javaScore+"\t " +sqlScore);
		 System.out.println("- - - - - - - - - - - - - - - - - - - - ");
		 System.out.println("Java��SQL�ĳɼ���: "+(javaScore-sqlScore));
		 System.out.println("3�ſε�ƽ���ɼ��� "+(double)(stbScore+javaScore+sqlScore)/3);
	}
}
