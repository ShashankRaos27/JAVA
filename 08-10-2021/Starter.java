class Starter
{
	public static void main(String[] Rao)
	{
		//HandBag
		System.out.println("--------------HandBag-------------");
		new HandBag("wildCraft",1.5f); //1
		new HandBag("leather"); //2
		new HandBag(500.50f); //3
		new HandBag("medium","leather"); //4
		new HandBag(1.5f,"wildCraft"); //5
		new HandBag(1.5f,500.50f); //6
		new HandBag("medium","leather",1.5f); //7
		new HandBag(1.5f,"wildCraft","medium");// 8
		new HandBag(1.5f,"wildCraft",500.50f); //9
		new HandBag(1.5f,"wildCraft",500.50f,"leather"); //10
		
		//Climate
		System.out.println("--------------Climate-------------");
		new Climate("cool"); //1
		new Climate(577205); //2
		new Climate("winter","cold"); //3
		new Climate("cool","winter","cold"); //4
		new Climate("cool",577205,"winter","cold"); //5
		new Climate(577205,"cool","winter","cold");//6
		new Climate("cool","winter",577205,"cold");//7
		new Climate("cool","winter","cold",577205);//8
		new Climate("cool",577205);//9
		new Climate(577205,"cool");//10
		
		//HeadSet
		System.out.println("--------------HeadSet-------------");
		new HeadSet("apple");//1
		new HeadSet("white",20000);//2
		new HeadSet("white",20000,true);//3
		new HeadSet(20000);//4
		new HeadSet(true);//5
		new HeadSet(20000,true);//6
		new HeadSet(true,20000);//7
		new HeadSet("white",true,20000);//8
		new HeadSet("white",20000,"apple");//9
		new HeadSet("white","wirless","apple");//10

		
	}
}