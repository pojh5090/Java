package com.kh.run;

import com.kh.variable.E_KeyboardInput;

//import com.kh.variable.A_Variable;
//import com.kh.variable.B_Constant;
//import com.kh.variable.C_Cast;
//import com.kh.variable.D_Print;

public class Run {  //실행 클래스
	public static void main(String[] args) {
		//기능 클래스(A_Variable) 알맹이 만들기
		//com.kh.variable.A_Variable av = new com.kh.variable.A_Variable();
		//이렇게 패키지 모두 써줘야 어디에 있는 A_Variable 인지 알 수 있음!
		
		//A_Variable av = new A_Variable();
		//av.declareVariable();
		//av.initVariable();
		
//		B_Constant bc = new B_Constant();
//		bc.finalConstant();
		
//		C_Cast cc = new C_Cast(); 
//		cc.rule1();
		
		//D_Print dp = new D_Print();
		//dp.printlnExample();
		//dp.printExample();
		//dp.printfExample();
		
		E_KeyboardInput eki = new E_KeyboardInput();
		eki.input2();
	}
}
