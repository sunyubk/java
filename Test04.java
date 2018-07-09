package com.bdqn.sunyu;

import java.util.Scanner;


public class Test01 {

	 public static void main(String[] args) {
		 Scanner input=new Scanner(System.in);
		 System.out.print("STB的成绩是：");
		 int stbScore=input.nextInt();
		 System.out.print("Java的成绩： ");
		 int javaScore=input.nextInt();
		 System.out.print("SQL的成绩是： ");
		 int sqlScore=input.nextInt();
		 System.out.println("- - - - - - - - - - - - - - - - - - - - ");
		 System.out.println("SBT\tJava\tSQL\n "+stbScore+"\t "+javaScore+"\t " +sqlScore);
		 System.out.println("- - - - - - - - - - - - - - - - - - - - ");
		 System.out.println("Java和SQL的成绩差: "+(javaScore-sqlScore));
		 System.out.println("3门课的平均成绩： "+(double)(stbScore+javaScore+sqlScore)/3);
	}
}
