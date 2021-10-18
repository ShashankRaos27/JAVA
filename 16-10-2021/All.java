class All{
	public static void main(String[] rao)
	{
		Computer computer=new Computer();
		computer.brand="hp";
		computer.modelNo=10;
		computer.quantity=5;
		computer.price=50000;
		computer.displayDetails();
		computer.displayTotalPrice();
		
		
		
		Computer computer1=new Computer();
		computer1.brand="DELL";
		computer1.modelNo=10;
		computer1.quantity=5;
		computer1.price=50000;
		computer1.displayDetails();
		computer1.displayTotalPrice();
		computer.displayAllTotalPrice();
		computer1.displayAllTotalPrice();
	}
}