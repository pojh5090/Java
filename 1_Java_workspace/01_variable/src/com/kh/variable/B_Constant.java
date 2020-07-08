package com.kh.variable;

public class B_Constant {
	public void finalConstant() {  //상수
		//선언 후 초기화 : 일반 변수 age, 상수 변수 AGE
		int age;
		final int AGE;
		
		age = 20;
		AGE = 20;
		
		System.out.println("age : " + age);
		System.out.println("AGE : " + AGE);
		
		
		
		//변수의 값 변경
		age = 30;
		//AGE = 30; -> 이거 불가능!
		
		System.out.println("변경 후 age : " + age);
		System.out.println("변경 후 AGE : " + AGE);
		System.out.println("상수 값은 한 번 기록 후 값 변경 불가능");
	}
	
}
