package com.bdqn.sunyu;
import java.util.*;

public class Test04 {
	public static void main(String[] args){
		
		Scanner input=new Scanner(System.in);
		System.out.println("请输入第一个操作数：");
		int num=0;
		int numb=0;
		 try{
			 num=input.nextInt();
		 }catch(Exception e){
			System.out.println("请输入数字！");	
			return;
		 }
		System.out.println("请输入第二个操作数：");

	
		try{
			 numb=input.nextInt();
		 }catch(Exception e){
			System.out.println("请输入数字！");	
			return;
		 }
		System.out.println("请输入操作符(+,-,*,/)");
		char js=(char)input.next().toString().charAt(0);		
		double result=0;
 		switch (js){
 			case '+':
 				result=num+numb;
 				break;
 			case '-':
 				result=num-numb;
 				break;
 			case '*':
 				result=num*numb;
 				break;
 			case '/':
 				result=num/numb;
 				break;
 			default :
 			     System.out.println("请输入正确的运算符");
 			     return;
 			   
 		}
		System.out.println("计算结果"+result);
 		
	
	}
}
