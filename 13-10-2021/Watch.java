class Watch{
	String countryMade="INDIA";
	TypeWatch typeWatch=TypeWatch.FASTRACK;
	void displayDetails()
	{
		System.out.println("invoking displayDetails method");
		String s=this.countryMade;
		TypeWatch h=this.typeWatch;
		System.out.println(s);
		System.out.println(h);
		
	}
}