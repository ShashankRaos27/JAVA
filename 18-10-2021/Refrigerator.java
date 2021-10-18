class Refrigerator{
	int model;
	String company;
	double liters ;
	boolean doubledoor;
	Refrigerator(int m,String s,double d,boolean b)
	{
		this.model=m;
		this.company=s;
		this.liters=d;
		this.doubledoor=b;
	}
	int getModel()
	{
		return this.model;
	}
	String getCompany()
	{
		return this.company;
	}
	double getLiters()
	{
		return this.liters;
		
	}
	boolean getDoubledoor()
	{
		return this.doubledoor;
	}
	void setModel(int s)
	{
		this.model=s;
	}
	void setCompany(String c)
	{
		this.company=c;
	}
	void setLiters(double d)
	{
		this.liters=d;
	}
	void setDoubleDoor(boolean b) 
	{
		this.doubledoor=b;
	}
}
