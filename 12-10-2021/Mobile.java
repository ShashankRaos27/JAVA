class Mobile
{
	String color;
	int price;
	MobileBrands brands=MobileBrands.APPLE;
	int modelNo;
	String quality;
	
	Mobile(int mN,int prc)
	{
		this("gold","excellent"); //chaining
		this.modelNo=mN;
		this.price=prc;
		System.out.println("invoking int and int con");
		int p=this.price;
		System.out.println(p);
	}
	
	Mobile(String color,String quality)
	{
		this.color=color;
		this.quality=quality;
		System.out.println("invoking int and int con");
		String c=this.color;
		String q=this.quality;
				System.out.println(c+q);

	}
	
	
}