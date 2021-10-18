class Computer{
	String brand;
	int modelNo;
	int quantity;
	double price;
	Type type=Type.LAPTOP;
	static double totalOfAll;
	Computer()
	{
		System.out.println("invoking con  computer    ");
	}
	void displayDetails()
	{
		System.out.println("invoking displayDetails method");
		System.out.println(this.brand);
		System.out.println(this.modelNo);
		System.out.println(this.quantity);
		System.out.println(this.price);
		System.out.println(this.type);
		System.out.println("default value of static variable  " +this.totalOfAll);
	}
	void displayTotalPrice()
	{
		System.out.println("invoking displayTotalPrice  method");
		Computer.totalOfAll=this.price*this.quantity;
		System.out.println(Computer.totalOfAll);
	}
	void displayAllTotalPrice()
	{
		System.out.println("invoking displayAllTotalPrice   method");
		Computer.totalOfAll=Computer.totalOfAll+totalOfAll;
		System.out.println(Computer.totalOfAll);
	}
	
	}