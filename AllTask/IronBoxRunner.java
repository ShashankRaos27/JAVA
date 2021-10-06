class IronBoxRunner{
	public static void main(String[] values){
		System.out.println("ironing process");
	
		String type= "silk";
		IronBox.heating(type); //ref arg
		String temperature="IronBox is in 90 degree heat";
		System.out.println(temperature);// val arg
		boolean TF= true;
		IronBox.steamWater(TF);
	}
}