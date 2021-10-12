class MobileStarter
{
	public static void main(String[] rao)
	{
		Mobile mobile=new Mobile(13,70000);
		MobileBrands s=mobile.brands;
		System.out.println(s);
		mobile.brands=MobileBrands.SAMSUNG;
		System.out.println(mobile.brands);
		mobile.quality="good";
		System.out.println(mobile.quality);

		
	}
	
}