package helmet;

public class Helmet {
		String[] brand= new String[5];
		int count=0;
		
		public Helmet()
		{
			System.out.println("no - arg construcor");
		}
	 public  void add(String brandName)
	 {

			System.out.println("add method invoked  ");
			if(brandName!=null && this.count<this.brand.length)
			{
				this.brand[count]=brandName;
				count++;
				System.out.println("helmets brand------->".concat(brandName));	
			}
			else
			{
				System.err.println("helmet brand name cannot be a null");
			}
	 }
	 public void displayBrandName()
		{
		 System.out.println("invoking display method");
		 for(int i=0;i<this.brand.length;i++)
		 {
			 String ref=this.brand[i];
			 System.out.println(ref);
		 }
		}
	}



