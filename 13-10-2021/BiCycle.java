class BiCycle{
	String color="balck";
	int price=20000;
	String brand="BTWIN";
	Type type= Type.WITHGEAR;
	void brake() //non static instance
	{
		System.out.println("Invoking brake method");
		
	}
	void move()
	{
		System.out.println("Invoking move method");
		
	}
	void displayDetails()
	{
		System.out.println("invoking displayDetails method");
		String s = this.color;
		int h=this.price;
		Type a=this.type;
		Type r=Type.WITHGEAR;
		System.out.println(s);
		System.out.println(h);
		System.out.println(r);


	}
	
	}