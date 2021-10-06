class Lighter{
	public static boolean onMethod()
	{
		System.out.println("invoked on  :");
		return true;
	}
	public static boolean offMethod()
		{
			System.out.println("invoked off  :");

			return false;
		}

	public static boolean light(int width)
	{
		if(width>0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}s