package com.bdqn.sunyu;

public class Test06 {
	public static void main(String[] args){
double student=250000;
		
		int years=2012;
		while(student<=1000000){
			years=years+1;
			student=student*(1+0.25);
			
			if(student!=1000000){
				years++;
			}
		}
		
		System.out.println(years);
		
	}
}


