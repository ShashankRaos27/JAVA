class Bottle{
	public static void storing(int price, String color, int height, String quality,String[] brands)
	{
		System.out.println("bottle details ");
		System.out.println("======================");
		System.out.println("bottle dprice: "+price);
		System.out.println("Bottle color :" +color);
		System.out.println("bottle height :" +height);
		System.out.println("bottle quality :"+quality);
		for(int index=0;index<brands.length;)
		{
			String Bottle=brands[index];
			System.out.println(Bottle);
			index++;
		}
		
		
	}
}