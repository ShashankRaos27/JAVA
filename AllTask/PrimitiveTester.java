class PrimitiveTester
{
	public static void main(String[] values)
	{
		byte b= 127;
		short s= 32767;
		int i = 2147483647;
		long l = 9223372036L;
		float f = 7.758995F;
		double d = 12.4587568566D;
		boolean bool = true; 
		char c = 'p';
		if(bool==false)
		{
			System.out.println(" print a boolean (false) value " + bool);
		}
		else{
			System.out.println(" print a boolean (true) value " + bool);
		}
		
		System.out.println(" print a boolean value " + b);
		System.out.println(" print a boolean value " + i);
		System.out.println(" print a boolean value " + l);
		System.out.println(" print a boolean value " + f);
		System.out.println(" print a boolean value " + d);
		System.out.println(" print a boolean value " + c);
	}
}
