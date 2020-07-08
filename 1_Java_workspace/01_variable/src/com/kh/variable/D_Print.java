package com.kh.variable;

public class D_Print {
	public void printlnExample() {
		System.out.println("안녕하세요");
		System.out.println("반갑습니다");
		System.out.println();  //줄바꿈만 하는 것.
	}
	
	public void printExample() {
		System.out.print("안녕하세요");
		System.out.print("반갑습니다");
		//System.out.print();   ->이건 ()안에 꼭 있어야함 ..
	}
	
	public void printfExample() {
		String str1 = "안녕하세요";
		String str2 = "반갑습니다";
		
		//System.out.printf(format, args)
		//                 포맷터 지정 , 포맷터에 맞게 값 대입
		System.out.printf("%s, 박신우 입니다. %s.\n", str1, str2);
		System.out.printf("%s, 친하게 지내요!\n", str2);
		
		System.out.println();
		
		//미니 문제
		//안녕하세요, 저는 20살 박신우 강사입니다. 만나서 반갑습니다.
		int age = 20;
		String name = "박신우";
		String job = "강사";
		
		System.out.printf("%s, 저는 %d살 %s %s입니다. 만나서 %s.", str1, age, name, job, str2);
	}
	
}
