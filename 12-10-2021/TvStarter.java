class TvStarter{
	public static void main(String[] rao)
	{
		Tv tv=new Tv("japan",50000);
		String s =tv.made;
		System.out.println(s);
		TvBrands h =tv.brand;
		System.out.println(h);
		tv.size=32.0f;
		System.out.println(tv.size);
		TvBrands a=tv.brand;
		System.out.println(a);
		tv.brand=TvBrands.TCL;
		System.out.println(tv.brand);
		int price=tv.price;
		System.out.println(price);
		tv.brand=TvBrands.LG;		
		System.out.println(tv.brand);
		tv.type="LCD";
		System.out.println(tv.type);

		Tv tv1=new Tv();
        tv1.size=32.0f;
		System.out.println(tv1.size);
		
		Tv tv2=new Tv("doom");
		
	}
	
}