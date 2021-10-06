class Bike{
	public static void brake(int speed){
		if(speed<20)
		{
			System.out.println("bike is stopped");
		}
		else
		{
		System.out.println("bike is not stopped");
		return;
		}
		System.out.println("end of bike");
		return;
		
	}
	public static int currentSpeed(){
		System.out.println("invoked currentSpeed");
		int speed=60;
		System.out.println(speed);
		return speed;
	}
}