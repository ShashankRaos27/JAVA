class RefrigeratorStarter
{
	public static void main(String[] rao)
	{
		Refrigerator refrigerator=new Refrigerator(2021,"samsung",30.5,true);
		String s=refrigerator.getCompany();
		boolean b=refrigerator.getDoubledoor();
		if(s==null)
		{
			System.out.println("pointing to no memory location");
		}
		else	
		System.out.println(s);	
		
		if(b=true)
		{
			System.out.println("refrigerator having doubleDoor  ");
		}
		refrigerator.setModel(2015);
		refrigerator.setCompany("lg");
		refrigerator.setLiters(40.03);
		refrigerator.setDoubleDoor(false);
		System.out.println(refrigerator.getModel());
		System.out.println(refrigerator.getCompany());
		System.out.println(refrigerator.getLiters());
		System.out.println(refrigerator.getDoubledoor());
	}
}