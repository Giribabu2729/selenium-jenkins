package com.demo;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello world!!");
		System.out.println("This is second change");

		String s = "Madhuri is good girl";
		System.out.println(s.length());

		// s = s.trim()
		// s = s.replaceAll("\\s","");
		System.out.println(s.length());

		String[] newString = s.split(" ");
		for (int i = 0; i < newString.length; i++) {
			System.out.println(newString[i]);
		}

	}

}
