class Calendar{
	public static int getBirthMonth(String personName)
	{
		if(personName=="shashank")
		{
			return 8;
		}
		else if(personName=="srivatsa")
		{
			return 2;
		}
		else if(personName=="abhi");
		{
			return 5;
		}
		//else
		//{
		//	return 10;
		//}
		
	}
	public static String getBirthDay(String personName)
	{
		if(personName=="Shashank")
		{
			return "thursday";
		}
		else if(personName=="srivatsa")
		{
			return "monday";
		}			
		else if(personName=="abhi")
		{
			return "sunday";
		}
		else
		{
			return "friday";
		}
		
	}
}