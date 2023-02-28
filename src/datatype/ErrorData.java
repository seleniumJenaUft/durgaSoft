package datatype;

public class ErrorData {

	public static void main(String[] args) {
//		int 4 byte
//		byte -1 byte
//		short - 2 byte
//		float - 5 to 6 decimal place accuracy- 4 byte - -1.7*10^38 - 1.7
//		double - 14 to 15 decimal place accuracy- 8 byte- 3.4*10^
//		long - 8 byte- -2^63 to 2^63
//		boolean - virtual machine dependent - size is not defined , 
//					no range , allowed value- true, false
		byte b =128;
		byte c=1.123;
		byte v=true;
		boolean r=True;
		boolean t="true" ;
		float f1=123.2345;//have to explicityly define as float with F;
//		float f2=0X12.1234f;
//		double d23=0X123.13434;// compile time first error.invalid hex literal
		double d=0786; // 8 is not allowed in octal so considered as int but the number is too large 
		char c1='a';		
		int x=0;
		if(x)
			System.out.println("false");
		else 
			System.out.println("true");
//================== literals
		int xtr =086;// 8 is not allowed in octal
		int wer=0xbeer;// r is not allwed in hexa
	}

}
