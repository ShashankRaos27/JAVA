class Camera
{
	String brand;
	int model;
	int pixel;
	double price;
	boolean nightMode;
	
	Camera(String b,int m,int p,double pr,boolean n)
	{
		this.brand=b;
		this.model=m;
		this.pixel=p;
		this.price=pr;
		this.nightMode=n;
	}
	String getBrand()
	{
		return this.brand;
	}
	
	int getModel()
	{
		return this.model;
	}
	int getPixel()
	{
		return this.pixel;
	}
	double getPrice()
	{
		return this.price;
	}
	
	boolean getNightMode()
	{
		return this.nightMode;
	}
	void setBrand(String s)
	{
		this.brand=s;
	}
	void setModel(int m)
	{
		this.model=m;
	}
	void setPixel(int p)
	{
		this.pixel=p;
		
	}
	void setPrice(double d)
	{
		this.price=d;
	}
	void setNightMode(boolean b)
	{
		this.nightMode=b;
	}
}