class InverterRunner
{
	public static void main(String[] args)
	{
		Inverter inverter=new Inverter();
		System.out.println(inverter.make);
		System.out.println(inverter.price);
		System.out.println(inverter.capacity);
		System.out.println(inverter.color);
		System.out.println(inverter.weight);
		inverter.make= "amaron";
		inverter.color = "black";
		System.out.println(inverter.make);
		Inverter inverter1=new Inverter();
		System.out.println(inverter1.price);
		System.out.println(inverter1.color);

		
	}
}