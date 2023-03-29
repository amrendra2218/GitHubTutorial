package com.AutomationTesting;

public class Testing1 {

	private static final String String = null;

	public static void main(String[] args) {
		StringBuffer sb= new StringBuffer();
		StringBuffer sb1=new StringBuffer(1000);
		System.out.println(sb.capacity());
		System.out.println(sb1.capacity());
		String  s = "Amrendra";
		StringBuffer sb2 =new StringBuffer(s);
		System.out.println(sb2);
		System.out.println(sb2.append(" Kumar"));
		System.out.println(sb2.capacity());
		sb2.trimToSize();
		System.out.println(sb2.capacity());
		sb2.ensureCapacity(10000);
		System.out.println(sb2.capacity());
		sb2.trimToSize();
		sb2=sb2.append("Aman verma");
		System.out.println(sb2.capacity());
		System.out.println(sb2);
		String s2="Rohan";
		String s3=s2.concat("chaudhary");
		System.out.println(s3);
		System.out.println(s3.length());
		s3.replace(s, s);
		
		
		
		
		
		
		

	}

}
