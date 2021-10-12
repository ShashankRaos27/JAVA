class HeadSet{
	String brand;
	int price=3435;
	String type ;
	String color;
	boolean noiseCancellation;
	
	HeadSet(String company)//1
	{
		System.out.println("Invoking constructor string");
		brand=company;
		System.out.println(brand);
	}
	HeadSet(String colour,int cost )//2
	{
		System.out.println("Invoking constructor String and cost");
		color=colour;
		price=cost;
		System.out.println(color+"\t"+cost);
	}
	HeadSet(String colour,int cost,boolean noiseCancellation )//3
	{
		System.out.println("Invoking constructor string int and boolean");
		System.out.println(colour+"\t"+cost+"\t" +noiseCancellation);
		colour=colour;
		cost=cost;
		noiseCancellation=noiseCancellation;
		
		
	}
	
	HeadSet(int price)//4
	{
		System.out.println("Invoking constructor int");
		price=price;
		System.out.println(price);
	}
	HeadSet(boolean noiseCancellation)//5
	{
		System.out.println("Invoking constructor int");
		noiseCancellation=noiseCancellation;
		System.out.println(noiseCancellation);
	}
	HeadSet(int price,boolean noiseCancellation)//6
	{
		System.out.println("Invoking constructor int boolean");
		price=price;
		noiseCancellation=noiseCancellation;
		System.out.println(price);
		System.out.println(noiseCancellation);
	}
	HeadSet(boolean noiseCancellation,int price)//7
	{
		System.out.println("Invoking constructor boolean");
		price=price;
		noiseCancellation=noiseCancellation;
		System.out.println(price);
		System.out.println(noiseCancellation);
	}
	HeadSet(String colour,boolean noiseCancellation,int price)//8
	{
		System.out.println("Invoking constructor int boolean");
		price=price;
		colour=colour;
		noiseCancellation=noiseCancellation;
		System.out.println(price);
		System.out.println(noiseCancellation);
	}
	HeadSet(String colour,int cost, String company )//9
	{
		System.out.println("Invoking constructor String and int string");
		color=colour;
		price=cost;
		company=company;
		System.out.println(color+"\t"+cost+"\t"+company);
	}
	HeadSet(String colour,String type, String company )//10
	{
		System.out.println("Invoking constructor String and int string");
		color=colour;
		type=type;
		company=company;
		System.out.println(color+"\t"+type+"\t"+company);
	}
	
}	