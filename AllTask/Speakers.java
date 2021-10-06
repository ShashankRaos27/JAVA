class Speakers{
	public static String volume(int level)
	{
		if(level<=0)
		{
			return "on it first";
		}
		else if(level<=3)
		{
			return "ok";
		}
		else if(level>3 && level<5)
		{
			return "loud" ;
			
		}
		else if(level>5 && level<9)
		{
			return "too loud";
		}
		else
		{
			return "call police"; 
			
		}
	}
		public static boolean turnOn()
		{
			boolean on=true;
			return on;		
		}
		public static boolean turnOff()
		{
			boolean off=false;
			return off;
		}
	
	
}