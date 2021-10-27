package helmet;

public class Monitor {
	String[] brands= new String[5];
	int count=0;
	public Monitor()
	{
		System.out.println("monitor constructor invoked   ");
	}
 public void add(String brandName)
 {
	 if(brandName!=null && this.count<this.brands.length)
	 {
		this.brands[count]=brandName; 
		count++;
	 }
	 else
	 {
		 System.err.println("String cannot be a null value  ");
	 }
	 
 }
 public void displayBrandsName()
 {
	 System.out.println("  displayBrandsName invoked   ");
	 for(int i=0;i<this.brands.length;i++)
	 {
		 String ref=brands[i];
		 System.out.println(ref);
	 }
 }
 
}
