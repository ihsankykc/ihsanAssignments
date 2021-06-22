package day3_variables_dataTypes;

public class primitiveVariables {

	public static void main(String[] args) {
		byte b1=25;
		byte b2=-25;
		//byte b3 128;
			System.out.println("b1 = "+b1);
			System.out.println("b2 = "+b2 +"\n");
		
		short s1=-32768;
		short s2= 32767;
		short s3= 500;
			System.out.println("s1 ="+s1);
			System.out.println("s2 =" + s2);
			System.out.println("s3 ="+ s3 + "\n");
				
		int i1= -214768;
			System.out.println("i1="+ i1 );
			System.out.println("");
		
		long l1 = 5000; //Suffix L is optional. Literal 5000 is of int type
		long l2 =-2147483649L; //Suffix L is mandatory, this number is out of int range
		long creditCardNumber = 5876_1234_3453_9832l;
			System.out.println("l1 = " + l1);
			System.out.println("l2 = " + l2);
			System.out.println("Credit Card Number = " + creditCardNumber);
			System.out.println("");

		float f1 = 2.1f;
		double PI = 3.14;
			System.out.println("f1 = " + f1);
			System.out.println("PI = " + PI);
			System.out.println("");
		
		char c1 = 'A';
		char c2 = 65;		
		char c3 = '\u0041';		
			System.out.println(c1);
			System.out.println(c2);
			System.out.println(c3);
		char c4 = 8658;
		System.out.println(c4 + "\n");
			
		boolean status = true;
		boolean status2 = false;
			System.out.println("Eligable to take the exam: " + status);
			System.out.println("He is 16, can he take driver licance? :" + status2);
		
		String name = "Ihsan";
			System.out.println("My name is " + name );
	}

}
