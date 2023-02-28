package datatype;

public class Data {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	inte -4 byte
//		byte -1 byte
//		short - 2 byte
//		float - 5 to 6 decimal place accuracy- 4 byte - -1.7*10^38 - 1.7
//		double - 14 to 15 decimal place accuracy- 8 byte- 3.4*10^308
//		long - 8 byte- -2^63 to 2^63
//		boolean - virtual machine dependent - size is not defined , 
//					no range , allowed value- true, false- default - false
//		char - 2 byte java -unicode based , old language - ascii code value- default - space
//		 null is not applicable to primitive data type , only for objects 
	boolean b=true;	
//	if number prifixed with 0 then considered octal
	int O1 =010;
//	if number proceed 0X then hexadecimal
	int h1=0X10;// java not case sensitive with the alphabets a to f for hexa
	long h11=0X10l;
	int h2=0xFace;
	int h3=h1+h2;
	float f1=1.1233F;// float has to be explicitly defined in the literal
	float f11=1.1233f;
	double d1=1.123D; // double can be specified with D/d but this is not required as its default
	double d=0123.123456;// this is changed to double decimal and its not octal.. even hexadecimal is not allowed
	double d3=0X786;
	double d4=12e3;
	char c2=97;// 0 to 65535, 1971 and 19710 will give same result as question mark as the value is not defined or font is not present
	char c3=0xface;
	char cf='\u0061';
	System.out.println(cf);
	System.out.println(d4);
	System.out.println(d3);
	System.out.println(O1);
	System.out.println(h1);
	System.out.println(h2);
	System.out.println(h3);
	System.out.println(h11);
	
System.out.println(.2+.7);
System.out.println(.2+.1);
System.out.println(.2+.3);
	}

}
