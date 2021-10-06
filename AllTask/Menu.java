class Menu{
	public static void SetAndDisplayItems(String hotelName, String[] items){
		System.out.println("invoked SetAndDisplayItems");
		System.out.println("hotel Name: "+hotelName);
		for(int itemIndex=0;itemIndex<items.length;)
		{
			String item=items[itemIndex];
			System.out.println(item);
			itemIndex++;			
		}
		
	}
}
