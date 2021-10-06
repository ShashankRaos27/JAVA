class AllRunner
{
	public static void main(String[] args)
	{
		Fish fish=new Fish();
		System.out.println(fish.name);
		System.out.println(fish.quantity);
		fish.weight=500.0f;
		fish.color ="balck";
		System.out.println(fish.weight);
		System.out.println(fish.color);
		System.out.println(fish.size);
		// default value
		//Fish fish1=new Fish();
		// System.out.println(fish1.name);
		
		Train train=new Train();
		System.out.println(train.name);
		System.out.println(train.color);
		train.speed=90;
		train.totalPassenger=20000;
		System.out.println(train.speed);
		System.out.println(train.totalPassenger);
		System.out.println(train.trainNo);	
		
		Charger charger=new Charger();
		System.out.println(charger.brand);
		System.out.println(charger.color);
		charger.length=1.5f;
		charger.quantity=5;
		System.out.println(charger.length);
		System.out.println(charger.quantity);
		System.out.println(charger.weight);
		
		
		
		
		
		


	}
}