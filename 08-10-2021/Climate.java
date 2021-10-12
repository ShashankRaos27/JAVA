class Climate
{
	float temp=40.1f;
	String humidity;
	String type ;
	int location;
	String description;
	Climate(String humidity) //1
	{
		System.out.println("invoked Climate const string ");
		System.out.println("humidity   " +humidity);
		humidity=humidity;
	}
	Climate(int location)//2
	{
		System.out.println("invoked Climate const int ");
		System.out.println("location   "+location);
		location=location;
	}
	Climate(String type, String description) //3
	{
		System.out.println("invoked Climate const string and string ");
		System.out.println("type  "+type);
		System.out.println("description  "+description);
		type=type;
		description=description;
		
	}
	Climate(String humidity,String type, String description)//4
	{
		System.out.println("invoked Climate const string string and string ");
		System.out.println("type  "+type);
		System.out.println("description   "+description);
		System.out.println("humidity   "+humidity);
		humidity=humidity;
		type=type;
		description=description;
	}
	Climate(String humidity,int location,String type, String description)//5
	{
		System.out.println("invoked Climate const string string and string ");
		System.out.println("type   "+type);
		System.out.println("description   "+description);
		System.out.println("humidity   "+humidity);
		System.out.println("location   "+location);
		location=location;
		humidity=humidity;
		type=type;
		description=description;
	}
	Climate(int location,String humidity,String type, String description)//6
	{
		System.out.println("invoked Climate const string string and string ");
		System.out.println("type  "+type);
		System.out.println("description   "+description);
		System.out.println("humidity    "+humidity);
		System.out.println("location   "+location);
		location=location;
		humidity=humidity;
		type=type;
		description=description;
	}
	Climate(String humidity,String type, int location, String description)//7
	{
		System.out.println("invoked Climate const string string and string ");
		System.out.println("type    "+type);
		System.out.println("description    "+description);
		System.out.println("humidity   "+humidity);
		System.out.println("location   "+location);
		location=location;
		humidity=humidity;
		type=type;
		description=description;
	}
	Climate(String humidity,String type,  String description, int location)//8
	{
		System.out.println("invoked Climate const string string and string ");
		System.out.println("type    "+type);
		System.out.println("description    "+description);
		System.out.println("humidity    "+humidity);
		System.out.println("location    "+location);
		location=location;
		humidity=humidity;
		type=type;
		description=description;
	}
	Climate(String humidity,int location) //9
	{
		System.out.println("invoked Climate const string and int ");
		System.out.println("humidity  "+humidity);
				System.out.println("location  "+location);
		location=location;
		humidity=humidity;
	}
	Climate(int location,String humidity ) //10
	{
		System.out.println("invoked Climate const string and int ");
		System.out.println("humidity  "+humidity);
				System.out.println("location  "+location);
		location=location;
		humidity=humidity;
	}
	
}