package com.infosys.convertostring;

public class Demo1 {

	public static void main(String[] args) {
		//String str="100a"; // 100 in a string represntation
		// Exception in thread "main" java.lang.NumberFormatException: For input string: "100a"
		String str="100";
		int number=Integer.parseInt(str);
		System.out.println(++number);
		//long l=46547576588;  //  literal 46547576588 of type int is out of range 
		long l=46547576588L; 
		 str="46547576588";
		long l2=Long.parseLong(str);
		System.out.println(l2);
		/*
		 * int num=Integer.parseInt(str); System.out.println(num);
		 */
		
		long l3=1234567890L;
		String longValue=Long.toString(l3);
		System.out.println(longValue.length());
		
		
		System.out.println(Integer.toBinaryString(5));
		System.out.println(Integer.toHexString(16));
		       
	}

}
