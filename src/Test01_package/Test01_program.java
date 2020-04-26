package Test01_package;
//import java.lang.*; 
//import java.io.*; 
//import java.util.*;

public class Test01_program {

	public static void main(String[] args) {
		String a="abcdef";
			
		
		byte [] input1 = a.getBytes();
	    byte [] result = new byte [input1.length];
		
		for (int i=0;i<input1.length;i++)
						
			result[i] = input1[input1.length-1-i];
		//System.out.println(i);
		
		System.out.println(new String(result));
		
		
		
		
		
		
		
    } 
    
	}


