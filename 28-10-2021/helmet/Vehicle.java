package helmet;

public class Vehicle {
	int[] modelYear = new int[5];
	int count=0;
	public Vehicle()
	{
		System.out.println("Vehicle con is invokedd   ");
	}
	public void add(int modelNumber)
	{
		if(modelNumber!=0 && this.count<this.modelYear.length)
		{
			this.modelYear[count]=modelNumber;
			count++;
		}
		else
		{
			System.err.println("model number cannot be a 0");
		}
	}
	 public void displayModel()
	 {
		 for(int i=0;i<this.modelYear.length; i++)
		 {
			 int s=modelYear[i];
			 System.out.println(s);
		 }
	 }

}
