package com.andres.tutorial;

import java.util.Scanner;

public class Andres {
	public static void main(String... hi) {
		System.out.println("ing tamno");
		Scanner sc=new Scanner(System.in);
		int tamano =sc.nextInt();
	String[]vector=new String[tamano];
	
	vector[1]="hi";
	vector[1]="hola";

	for(String s:vector) {
		System.out.println(s);
	}
	}
}
