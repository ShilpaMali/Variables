package com.velocity.variable;

public class GlobalVariable {
	int a;         //global variable
	int b = 20; // global variable

	public static void main(String[] args) {
		
		// Call/access the value of global variable
		
		GlobalVariable globalVariable = new GlobalVariable();
		System.out.println("value of a is :" + globalVariable.a); // variable calling
		System.out.println("value of b is :" + globalVariable.b); // variable calling
	}
}
