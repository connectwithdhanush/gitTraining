package org.java;

public class oddEven {
	
	
	public int add(int a,int b) {
		int c=a+b;
		
		return c;
		

	}
	
	public static void main(String[] args) {
		
		oddEven h=new oddEven();
		int add = h.add(10,20);
		System.out.println(add);

//		// To identify whether number is odd or even:
//
//		// int num = 15;
//		// if (num % 2 == 0) {
//		// System.out.println("number is even");
//		// } else {
//		// System.out.println("number is odd");
//		// }
//		//
//
//		// To count number of odd and even number between 0 to 10
//
//		int oddcount = 0;
//		int evencount = 0;
//
//		for (int i = 0; i < 10; i++) {
//			if (i % 2 == 0) {
//				System.out.println("Given number is even" + i);
//				evencount++;
//			} else {
//				System.out.println("Given number is odd" + i);
//				oddcount++;
//			}
//
//		}
//		System.out.println("odd count value is " + oddcount);
//		System.out.println("even count value is " + evencount);

	}

}
