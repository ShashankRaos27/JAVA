class HandBag
{
String color= "yellow";
float price ;
String brand;
String size;
String material;
float capacity;
HandBag(String band, float cap) //1
{
	System.out.println("invoked HandBag const string and float");
	System.out.println("brand "+band);
	System.out.println("capacity  "+cap);
	
	brand=band;
	capacity=cap;

}
HandBag(String mat) //2
{
	System.out.println("invoked handBag string ");
	System.out.println("material "+mat);
	material=mat;
}
HandBag(float price) //3
{
	System.out.println("invoked handBag float");
	System.out.println("price " +price);
	price=price;
}
HandBag(String size, String mat ) //4
{
	System.out.println("invoked handBag string and string ");
	System.out.println("size " +size);
	System.out.println("material " +mat);
	size=size;
	material=mat;
}
HandBag(float cap, String band) //5
{
	System.out.println("invoked handBag float and string ");
	System.out.println("cap " +cap);
	System.out.println("band " +band);
	cap=cap;
	brand=band;	
}
HandBag(float cap,float price)//6
{
	System.out.println("invoked handBag float and float ");
	System.out.println("cap " +cap);
	System.out.println("price " +price);
	cap=cap;
	price=price;	
}
HandBag(String size, String mat,float cap)//7
{
	System.out.println("invoked handBag String,string and float ");
	System.out.println("size " +size);
	System.out.println("mat " +mat);
	System.out.println("cap " +cap);
	size=size;
	mat=mat;
	cap=cap;
}
HandBag(float cap, String band, String size) //8
{
	System.out.println("invoked handBag float string and string ");
	System.out.println("cap " +cap);
	System.out.println("band " +band);
	System.out.println("size " +size);
	size=size;
	brand=band;
	cap=cap;
}
HandBag(float cap,String band,float price) //9
{
	System.out.println("invoked handBag float string  string and float ");
	System.out.println("cap " +cap);
	System.out.println("band " +band);
	System.out.println("size " +size);
	System.out.println("price " +price);
	
	size=size;
	brand=band;
	cap=cap;
	price=price;
}
HandBag(float cap,String band,float price,String material) //10
{
	System.out.println("invoked handBag float string  string float and string ");
	System.out.println("cap " +cap);
	System.out.println("band " +band);
	System.out.println("size " +size);
	System.out.println("price " +price);
	
	size=size;
	brand=band;
	cap=cap;
	price=price;
	material=material;
}

}