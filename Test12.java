package com.bdqn.sunyu;
import java.util.*;

public class Test04 {
	public static void main(String[] args){
		
		Scanner input=new Scanner(System.in);
		System.out.println("�������һ����������");
		int num=0;
		int numb=0;
		 try{
			 num=input.nextInt();
		 }catch(Exception e){
			System.out.println("���������֣�");	
			return;
		 }
		System.out.println("������ڶ�����������");

	
		try{
			 numb=input.nextInt();
		 }catch(Exception e){
			System.out.println("���������֣�");	
			return;
		 }
		System.out.println("�����������(+,-,*,/)");
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
 			     System.out.println("��������ȷ�������");
 			     return;
 			   
 		}
		System.out.println("������"+result);
 		
	
	}
}
