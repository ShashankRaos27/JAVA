class Tv{
	String made;
	int price;
	TvBrands brand=TvBrands.SONY;
	float size;
	String type;
	Tv(String mad,int pric)
	{
		this(); // chaining
		
		this.made=mad;
		this.price=pric;
		System.out.println("invoking con String and int");
		
		
	}
	Tv()
	{
		this("doom"); //chaining
		this.type="LED";
		this.size=40f;
		System.out.println("invoking No arguments  con");
		
		
	}
	Tv(String s)
	{
		this.type=s;
		System.out.println("invoking String con");

	}
}