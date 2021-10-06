class Plant{
	public static void grow(String plantName){
		System.out.println("invoked grow");
		float height=10.9f;
		System.out.println(height);
		System.out.println(plantName);
	}
	public static void watering(int liters){
		System.out.println("invoked watering");
		System.out.println("liters :" +liters);
		boolean enough=false;
		System.out.println("enough :"+enough);
	}
}