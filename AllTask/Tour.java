class Tour{
	public static void details(int cost, String startPoint, String destination, String places[])
	{
		System.out.println("Tour details   ");
		System.out.println("====================");
		System.out.println("total cost  :"+cost);
		System.out.println("Starting point  :"+startPoint);
		System.out.println("ending point  :"+destination);
		for (int index=0; index<places.length;)
		{
			String Places=places[index];
			System.out.println(Places);
			index++;
			
		
	}
}
}