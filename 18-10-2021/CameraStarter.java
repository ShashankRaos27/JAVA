class CameraStarter{
	public static void main(String[] rao)
	{
		Camera camera=new Camera("canon",2021,100,200.00,true);
		String s=camera.getBrand();
		boolean b=camera.getNightMode();
		if(s!=null)
		{
			System.out.println(s);
		}
		if(b=true)
		{
			System.out.println("camera having nightMode  ");
		}
		else
			System.out.println("camera doesn't having nightMode  ");
			
		camera.setBrand("nikon");
		camera.setModel(2020);
		camera.setPixel(120);
		camera.setPrice(20000.000);
		camera.setNightMode(false);
		
		System.out.println(camera.getBrand());
		System.out.println(camera.getModel());
		System.out.println(camera.getPixel());
		System.out.println(camera.getPrice());
		System.out.println(camera.getNightMode());
		
	}
	
}