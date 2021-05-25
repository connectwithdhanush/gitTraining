package org.java;

public class equalsmethodoperator {
	public static void main(String[] args) {
		String s1 = "java";
		String s2 = "java";
		String s3 = new String("java");

		if (s1 == s2) {

			System.out.println("Both strings are equal");

		} else {
			System.out.println("Both strings are not equal");

		}
		
		
		
		if (s1 == s3) {

			System.out.println("Both strings are equal");

		} else {
			System.out.println("Both strings are not equal");

		}
		
		
		
		
		boolean  equalsmethod = s1.equals(s3);
		System.out.println(equalsmethod);
		
		
		
	}

}
