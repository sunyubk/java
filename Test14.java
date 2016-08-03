package com.bdqn.sunyu;
import java.util.Scanner;

public class Test06{
	public static void main (String[]args){
		Scanner input=new Scanner(System.in);
		System.out.print("Çë²¦ºÅ£º");
		int num=input.nextInt();
		switch(num){
		case 1:
			System.out.print("ÒÔ²¦ºÅ£º°Ö°Ö");
			break;
		case 2:
			System.out.print("ÒÔ²¦ºÅ:ÂèÂè");
			break;
		case 3:
		System.out.print("ÒÔ²¦ºÅ£ºÒ¯Ò¯");
			break;
		case 4:
			System.out.print("ÒÔ²¦ºÅ£ºÄÌÄÌ");
			break;
		}
	}
}